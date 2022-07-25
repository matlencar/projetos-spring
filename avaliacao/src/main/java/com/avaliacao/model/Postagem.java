package com.avaliacao.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//Anotações são parameteos que definem seus comportamentos para elas.
@Entity // <---- Essa anotação indica que uma entidade do JPA Hibernete.
@Table(name = "postagens") //<---- Essa anotação faz com que essa entidade dentro do banco de dados vire uma tabela.
public class Postagem {

	// Adicionando as atributos
	
	@Id //<---- Anotação que faz com que esse atributo seja um id.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //<---- No banco de dados esse atributo se transformara numa chave primaria.
	private long id;
	
	@NotNull
	@Size(min = 5, max =100)
	private String titulo;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String tipo;
	
	@Temporal(TemporalType.TIMESTAMP) //<---- Anotação qur vai indicar que estamos trabalhando com tempo no JPA Hibernate.
	private Date date = new java.sql.Date(System.currentTimeMillis());

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}