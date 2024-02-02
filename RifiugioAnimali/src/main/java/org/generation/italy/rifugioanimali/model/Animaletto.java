package org.generation.italy.rifugioanimali.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Animaletto {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(nullable = false, length=20)
		private String specie;
		
		@Column(nullable = false, length=20)
		private String razza;
		
		@Column(nullable = false)
		private int eta;
		
		@Column(nullable = false)
		private boolean storicoVaccinale;
					
		@Column(nullable = false)
		private boolean chip;
		
		@Column(nullable = false)
		private boolean adottato;

		@ManyToOne(optional=false) //più animaletti stanno in una sola sede
		private Sede sede;
		
		@ManyToOne // più animaletti possono essere adottrati da un singolo utente
		private Utente utente;
		
		public Animaletto() {
			super();
			
		}

		public Animaletto(String specie, String razza, int eta, boolean storicoVaccinale, boolean chip,
				boolean adottato) {
			super();
			this.specie = specie;
			this.razza = razza;
			this.eta = eta;
			this.storicoVaccinale = storicoVaccinale;
			this.chip = chip;
			this.adottato = adottato;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSpecie() {
			return specie;
		}

		public void setSpecie(String specie) {
			this.specie = specie;
		}

		public String getRazza() {
			return razza;
		}

		public void setRazza(String razza) {
			this.razza = razza;
		}

		public int getEta() {
			return eta;
		}

		public void setEta(int eta) {
			this.eta = eta;
		}

		public boolean isStoricoVaccinale() {
			return storicoVaccinale;
		}

		public void setStoricoVaccinale(boolean storicoVaccinale) {
			this.storicoVaccinale = storicoVaccinale;
		}

		public boolean isChip() {
			return chip;
		}

		public void setChip(boolean chip) {
			this.chip = chip;
		}

		public boolean isAdottato() {
			return adottato;
		}

		public void setAdottato(boolean adottato) {
			this.adottato = adottato;
		}

		@Override
		public String toString() {
			return "Animaletto [id=" + id + ", specie=" + specie + ", razza=" + razza + ", eta=" + eta
					+ ", storicoVaccinale=" + storicoVaccinale + ", chip=" + chip + ", adottato=" + adottato + "]";
		}
	
		
}
