package org.lessons.java.security;

 public class  PasswordGenerator {
	 public String pswGenerator(String nome, String cognome, String colore, int giorno, 
			 int mese, int anno) {
		String psw = nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno); 
		 return psw;
	 }

}
