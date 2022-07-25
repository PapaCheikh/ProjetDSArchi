package com.esp.senactualite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.esp.senactualite.models.Categorie;

@RepositoryRestResource
@CrossOrigin("*")
public interface CategoryDao extends JpaRepository<Categorie, Long> {

}
