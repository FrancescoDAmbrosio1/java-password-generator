package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int somma;
		System.out.println("Inserisci il tuo nome:");
		String nome = input.nextLine();
		System.out.println("Inserisci il tuo Cognome:");
		String cognome = input.nextLine();
		System.out.println("Inserisci in numeri il giorno della tua nascita:");
		int giorno = input.nextInt();
		System.out.println("Inserisci in numeri il mese della tua nascita:");
		int mese = input.nextInt();
		System.out.println("Inserisci in numeri l'anno della tua nascita:");
		int anno = input.nextInt();
		somma = giorno + mese + anno;
		System.out.print("La password per te generata è: " + nome + "-" + cognome + "-" 
				+ somma);
	}

}