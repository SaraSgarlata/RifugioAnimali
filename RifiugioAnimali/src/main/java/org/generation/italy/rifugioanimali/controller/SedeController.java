package org.generation.italy.rifugioanimali.controller;

import java.util.List;
import java.util.Optional;

import org.generation.italy.rifugioanimali.model.Sede;
import org.generation.italy.rifugioanimali.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sede")
public class SedeController {

	@Autowired
	SedeRepository sedeRepository;
	
	@GetMapping("/elenco")
	public String elencoSedi (Model model) {
		List<Sede> elencoSedi = sedeRepository.findAll();
		model.addAttribute("/elenco", elencoSedi);
	
			return "/sede/elenco";
	}
	
	@GetMapping("/dettaglio/{id}")
    public String dettaglioSede(@PathVariable Integer identificativo, Model model) {
        Optional<Sede> optSede = sedeRepository.findById(identificativo);
        if(optSede.isPresent()) {
            model.addAttribute("contenuto", optSede.get());
            return "/sedi/dettaglio";
        }
        else
            return "/sedi/nonTrovato";
    }
}
