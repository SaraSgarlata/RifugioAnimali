package org.generation.italy.rifugioanimali.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Utente {
		
	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String cognome;
	
	@Column(nullable = false, length = 20)
	private String città;
	
	@Id
	@Column(nullable = false, length = 20)
	private String numTelefono;
	
	@OneToMany
	List<Animaletto> elencoAnimaletti;

	public Utente() {
		super();
		
	}

	public Utente(String nome, String cognome, String città, String numTelefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.città = città;
		this.numTelefono = numTelefono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	@Override
	public String toString() {
		return "Utente: nome =" + nome + ", cognome= " + cognome + ", città=" + città + ", numTelefono=" + numTelefono
				+ "]";
	}

	
	
}