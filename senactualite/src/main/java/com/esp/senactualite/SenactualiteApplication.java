package com.esp.senactualite;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.esp.senactualite.dao.ArticleDao;
import com.esp.senactualite.dao.CategoryDao;
import com.esp.senactualite.models.Article;
import com.esp.senactualite.models.Categorie;

@SpringBootApplication
public class SenactualiteApplication implements CommandLineRunner {
	@Autowired
	private ArticleDao articleDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private RepositoryRestConfiguration configuration;

	public static void main(String[] args) {
		SpringApplication.run(SenactualiteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Article.class,Categorie.class);
		
		
		
		/*
		 * categoryDao.save(new Categorie("Sport")); categoryDao.save(new
		 * Categorie("Santé")); categoryDao.save(new Categorie("Education"));
		 * categoryDao.save(new Categorie("Politique"));
		 * 
		 * articleDao.save(new Article("Première victoire du Sénégal",
		 * "Lorem ipsum dolor sit amet,...", new Date(2022, 05, 19, 20, 58, 50), new
		 * Date(2022, 05, 19, 20, 58, 50),"1.png" , categoryDao.getById(1L)));
		 * articleDao.save(new Article("Election en Mauritanie",
		 * "Lorem ipsum dolor sit amet,...", new Date(2022, 05, 19, 20, 58, 50), new
		 * Date(2022, 05, 19, 20, 58, 50),"4.jpg", categoryDao.getById(4L)));
		 * articleDao.save(new Article("Début de la can",
		 * "Lorem ipsum dolor sit amet,...", new Date(2022, 05, 19, 20, 58, 50), new
		 * Date(2022, 05, 19, 20, 58, 50),"1.png", categoryDao.getById(1L)));
		 * articleDao.save(new Article("Pétrole au Sénégal",
		 * "Lorem ipsum dolor sit amet,...", new Date(2022, 05, 19, 20, 58, 50), new
		 * Date(2022, 05, 19, 20, 58, 50),"4.jpg", categoryDao.getById(4L)));
		 * articleDao.save(new Article("Inauguration d'un ENO à l'UVS",
		 * "Lorem ipsum dolor sit amet,...", new Date(2022, 05, 19, 20, 58, 50), new
		 * Date(2022, 05, 19, 20, 58, 50),"3.jpeg", categoryDao.getById(3L)));
		 */
		 
	}

}
