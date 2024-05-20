package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotação restController avisa o Spring que se trata de uma classe controladora de acesso e definição de endpoint
@RestController
@RequestMapping("/ola-mundo")//anotação esta definindo o endpoint para acessar todos os métodos deve iniciar com /olamundo
public class HelloworldController {

	@GetMapping //anotação defini que o verbo http aqui será o get
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	
	@GetMapping("comidas")//anotação defini que o verbo http aqui será o get e vai ter o complemento no endpoint /comidas
	public String comidasFavoritas() {
		return "sushi \nHamburguer";
	}
	
	@GetMapping("livros")//anotação defini que o verbo http aqui será o get e vai ter o complemento no endpoint /livros
	public String livrosFavoritos() {
		return "Eragon \nSenhor dos Aneis";
	}
	
}
