package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome,sistemaOperativo,scelta,risposta;
		float prezzo;
		int download=0,valutazione=0;
		
		System.out.println("Inserire il proprio nome; ");
		nome = sc.nextLine();
		System.out.println("Inserire il sistema operativo del pc: ");
		sistemaOperativo=sc.nextLine();
		System.out.println("Inserire il prezzo dell'app");
		prezzo=Float.parseFloat(sc.nextLine());
		
		MobileApp app = new MobileApp(nome,sistemaOperativo,prezzo);
		
		do {
			System.out.println("Di seguito le operazioni che si possono fare: ");
			System.out.println("download singolo");
			System.out.println("download multiplo");
			System.out.println("ricevi valutazione");
			System.out.println("esci");
			
			System.out.println("Scegliere una delle voci del menu: ");
			scelta = sc.nextLine().trim().toLowerCase();
			
			switch(scelta) {
			case "download singolo":
				app.download();
				break;
			case "download multiplo":
				System.out.println("Quanti download sono stati effettuati?");
				download = Integer.parseInt(sc.nextLine());
				app.downloadMultiplo(download);
				break;
			case "ricevi valutazione":
				System.out.println("Dare una valutazione da 0 a 5");
				valutazione = Integer.parseInt(sc.nextLine());
				app.riceviValutazione(valutazione);
				app.valutazioneMedia();
				break;
			case "esci":
				break;
			}
			
			
			System.out.println("Vuoi continuare con le operazioni? si/no");
			risposta = sc.nextLine().toLowerCase();
		} while(risposta.equals("si"));
		
		System.out.println("Ecco la valutazione media: "+app.getValutazionemedia());
		System.out.println("Ecco il ricavo totale "+app.getRicavoTotale());
		
		sc.close();
		
	}

}
