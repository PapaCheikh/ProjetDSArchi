package com.esp.senactualite.controllers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esp.senactualite.dao.ArticleDao;
import com.esp.senactualite.models.Article;

@RestController
@CrossOrigin("*")
public class CatControll {
	@Autowired
	private ArticleDao articleDao;
	
	@GetMapping(path="/photoProduct/{id}",produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
        Article p=articleDao.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/articles/"+p.getPhoto()));
    }

	
	@PostMapping("/addarticles")
	public Article saveArticle(@RequestBody Article article) {
		return articleDao.save(article);
	}
	
	@DeleteMapping("/deleteArticle/{id}")
	public void deleteArticles(@PathVariable (value="id") Long id) {
		Optional<Article> art = articleDao.findById(id);
		if (art.isPresent()) {
			Article article = art.get();
			articleDao.delete(article);
		}
	}

}
