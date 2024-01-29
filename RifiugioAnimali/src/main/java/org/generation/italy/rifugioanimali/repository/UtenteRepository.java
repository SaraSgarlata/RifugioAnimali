package org.generation.italy.rifugioanimali.repository;

import org.generation.italy.rifugioanimali.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

public interface UtenteRepository extends JpaRepository<Utente, String> {

}
