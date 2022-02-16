package com.generation.mentalidadexhabilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/MentalidadexHabilidade")

public class HabilidadeMentalidadeController {
	
	@GetMapping
	public String getMentalidadexHabilidade()
	{ 
		return "Mentalidade x Habilidade!";
	}
	
	@GetMapping("/Descricao")
	public String getDescricao ()
	{ 
		return "As habilidades e mentalidades utilizadas nesse exercicio, foram as de atenção aos detalhes e persistencia, pois aprender algo novo e com tantas camadas a serem manipuladas, exige atenção e continuidade.";
	}

}
