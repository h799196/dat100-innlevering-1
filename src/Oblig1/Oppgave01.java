package Oblig1;

import javax.swing.JOptionPane;

public class Oppgave01 {

	public static void main(String[] args) {
		
		String melding = "Skriv inn poengsum 0-100 ";
		
		int poengsum = Integer.parseInt(JOptionPane.showInputDialog(melding));
		
		if (poengsum < 0 && poengsum >100) {
			System.out.print("Ugyldig verdi");}
			
		else if (poengsum<39) {	
			System.out.print("karakter F ");
		}
		else if (poengsum<49) {
			System.out.print("karakter E ");
		}
		else if (poengsum<59) {
			System.out.print("karakter D ");
		}
		else if (poengsum<79) {
			System.out.print("karakter C ");
		}
		else if (poengsum<89) {
			System.out.print("karakter B ");
		}
		else
			System.out.print("karakter A ");
		}
	}


