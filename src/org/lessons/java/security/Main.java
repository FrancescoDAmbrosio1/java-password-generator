package org.lessons.java.security;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utente nuovoUtente = new Utente();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome:");
		nuovoUtente.nome = input.nextLine();
		System.out.println("Inserisci il tuo Cognome:");
		nuovoUtente.cognome = input.nextLine();
		System.out.println("Inserisci il tuo Colore preferito:");
		nuovoUtente.colore = input.nextLine();
		System.out.println("Inserisci in numeri il giorno della tua nascita:");
		nuovoUtente.giorno = input.nextInt();
		System.out.println("Inserisci in numeri il mese della tua nascita:");
		nuovoUtente.mese = input.nextInt();
		System.out.println("Inserisci in numeri l'anno della tua nascita:");
		nuovoUtente.anno = input.nextInt();
		PasswordGenerator psw = new PasswordGenerator() ;
		
		System.out.print("La password per te generata è: " 
		+ psw.pswGenerator(nuovoUtente.nome, nuovoUtente.cognome, nuovoUtente.colore, nuovoUtente.giorno,
				nuovoUtente.mese, nuovoUtente.anno));

	}

}
