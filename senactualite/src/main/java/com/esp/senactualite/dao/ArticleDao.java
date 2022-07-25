package com.esp.senactualite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.esp.senactualite.models.Article;

@RepositoryRestResource
@CrossOrigin(origins="*")
public interface ArticleDao extends JpaRepository<Article, Long> {

}
