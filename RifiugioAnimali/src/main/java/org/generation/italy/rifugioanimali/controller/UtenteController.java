package org.generation.italy.rifugioanimali.controller;

import java.util.List;

import org.generation.italy.rifugioanimali.model.Utente;
import org.generation.italy.rifugioanimali.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utente")
public class UtenteController {

	@Autowired
	UtenteRepository utenteRepository;
	
	
	@GetMapping("/elenco")
		public String elencoUtenti (Model model) {
		List<Utente> elencoUtenti = utenteRepository.findAll();
		
		model.addAttribute("/elenco", elencoUtenti);
	
			return "/sede/elenco";
	}
	
	
}
