package com.esp.senactualite.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Libelle;
    @OneToMany(mappedBy = "categorie")
    private Collection<Article> articles;
	
	public Categorie() {
		super();
	}

	public Categorie(String libelle) {
		super();
		Libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibellé(String libelle) {
		Libelle = libelle;
	}
}
