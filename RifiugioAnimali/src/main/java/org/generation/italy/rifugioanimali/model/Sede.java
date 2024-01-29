package org.generation.italy.rifugioanimali.model;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Sede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String identificativo;
	
	@Column(nullable = false, length = 20)
	private String indirizzo;
	
	@Column(nullable = false, length = 20)
	private String direttore;
	
	@Column(nullable = false, length = 20)
	private String nomeRifugio;

	@OneToMany
	List<Animaletto> elencoAnimaletti;
	
	public Sede() {
		super();
		
	}

	public Sede(String identificativo, String indirizzo, String direttore, String nomeRifugio) {
		super();
		this.identificativo = identificativo;
		this.indirizzo = indirizzo;
		this.direttore = direttore;
		this.nomeRifugio = nomeRifugio;
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getDirettore() {
		return direttore;
	}

	public void setDirettore(String direttore) {
		this.direttore = direttore;
	}

	public String getNomeRifugio() {
		return nomeRifugio;
	}

	public void setNomeRifugio(String nomeRifugio) {
		this.nomeRifugio = nomeRifugio;
	}

	@Override
	public String toString() {
		return "Sede [identificativo=" + identificativo + ", indirizzo=" + indirizzo + ", direttore=" + direttore
				+ ", nomeRifugio=" + nomeRifugio + "]";
	}
	
	
}
