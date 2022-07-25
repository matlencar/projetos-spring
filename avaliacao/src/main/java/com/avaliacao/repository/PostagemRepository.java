package com.avaliacao.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	//<--FindAllByTitulo: Metodo para buscar o nome do atributo da minha entidade.
	//<--Containing: Tudo que conter os caracteres dentro da viravel ele vai buscar.
	//<--IgnoreCase: Não levar em consideração entre maiusculo e minusculo.
	public List<Postagem>findAllByTituloContainingIgnoreCase(String titulo);
}
