package com.blogpessoal.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blogpessoal.model.PostagemModel;
import com.blogpessoal.blogpessoal.repository.PostagemRepository;

@RestController//Mostra para o Spring que isso é um controlador
@RequestMapping("/postagens")//São as resh 
@CrossOrigin("*") //Aceita requisições de qualquer origim
public class PostagemController {
 
	 //Injeção de dependencia do Spring, faz a instancia do PostagemRepository
	//na class PostagemController
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PostagemModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
}























