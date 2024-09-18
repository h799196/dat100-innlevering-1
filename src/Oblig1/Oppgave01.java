package Oblig1;

import javax.swing.JOptionPane;

public class Oppgave01 {

	public static void main(String[] args) {
		
		int i;
		
		for (i=0;i<=10;i++) {
	
		String melding = "Skriv inn poengsum 0-100 ";
		
		int poengsum = Integer.parseInt(JOptionPane.showInputDialog(melding));
		
		if (poengsum < 0){
			System.out.println("Ugyldig verdi");}
		
		else if (poengsum > 100) {
			System.out.println("Ugyldig verdi");}
		
		else if (poengsum<39) {	
			System.out.println("karakter F ");
		}
		else if (poengsum<49) {
			System.out.println("karakter E ");
		}
		else if (poengsum<59) {
			System.out.println("karakter D ");
		}
		else if (poengsum<79) {
			System.out.println("karakter C ");
		}
		else if (poengsum<89) {
			System.out.println("karakter B ");
		}
		else
			System.out.println("karakter A ");
		}
	}
	}
	
	


