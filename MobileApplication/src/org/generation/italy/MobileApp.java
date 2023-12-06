package org.generation.italy;

public class MobileApp {

	private String nome, sistemaOperativo;
	private float prezzo, ricavoTotale,valutazionemedia;
	private int totaleValutazioni, numeroValutazioni, valutazione;
	
	public MobileApp (String nome, String sistemaOperativo, float prezzo) {
		this.nome=nome;
		this.sistemaOperativo=sistemaOperativo;
		this.prezzo=prezzo;
		ricavoTotale=0;
		totaleValutazioni=0;
		numeroValutazioni=0;
	}
	
	public void download () {
		ricavoTotale+=prezzo;
	}
	
	public void downloadMultiplo (int numeroDownload) {
		ricavoTotale+=prezzo*numeroDownload;
	}
	
	public void riceviValutazione (int numeroStelle) {
		totaleValutazioni+=numeroStelle;
		numeroValutazioni++;
	}
	
	public float valutazioneMedia() {
		valutazionemedia=totaleValutazioni/numeroValutazioni;
		return valutazionemedia;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		if (this.prezzo>0) {
			this.prezzo = prezzo;
		}
	}

	public float getRicavoTotale() {
		return ricavoTotale;
	}

	public void setRicavoTotale(float ricavoTotale) {
		this.ricavoTotale = ricavoTotale;
	}

	public float getValutazionemedia() {
		return valutazionemedia;
	}

	public void setValutazionemedia(float valutazionemedia) {
		this.valutazionemedia = valutazionemedia;
	}

	public int getTotaleValutazioni() {
		return totaleValutazioni;
	}

	public void setTotaleValutazioni(int totaleValutazioni) {
		this.totaleValutazioni = totaleValutazioni;
	}

	public int getNumeroValutazioni() {
		return numeroValutazioni;
	}

	public void setNumeroValutazioni(int numeroValutazioni) {
		this.numeroValutazioni = numeroValutazioni;
	}

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}
	
	
	
}
