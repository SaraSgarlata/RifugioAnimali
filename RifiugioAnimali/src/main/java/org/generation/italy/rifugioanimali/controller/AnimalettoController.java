package org.generation.italy.rifugioanimali.controller;

import java.util.List;

import org.generation.italy.rifugioanimali.model.Animaletto;
import org.generation.italy.rifugioanimali.repository.AnimalettoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/animaletto")
public class AnimalettoController {

	@Autowired
	AnimalettoRepository animalettoRepository;
	
	@GetMapping("/elenco")
	@ResponseBody
	public String elencoAnimaletti () {
		List<Animaletto> elencoAnimaletti = animalettoRepository.findAll();
		StringBuilder elenco = new StringBuilder();
		elenco.append("numero animaletti: " + elencoAnimaletti.size());
		elenco.append("<br><br>");
		for (Animaletto a:elencoAnimaletti) {
			elenco.append(a.toString()+"<br>");
		}
			return elenco.toString();
	}
	
}
