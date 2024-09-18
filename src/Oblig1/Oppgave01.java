package Oblig1;

import javax.swing.JOptionPane;

public class Oppgave01 {

	public static void main(String[] args) {
		
		String melding = "Skriv inn poengsum 0-100 ";
		
		int poengsum = Integer.parseInt(JOptionPane.showInputDialog(melding));
		
		if (poengsum<39 && poengsum>=0) {	
			System.out.print("karakter F ");
		}
		else if (poengsum<49 && poengsum>=0) {
			System.out.print("karakter E ");
		}
		else if (poengsum<59 && poengsum>=0) {
			System.out.print("karakter D ");
		}
		else if (poengsum<79 && poengsum>=0) {
			System.out.print("karakter C ");
		}
		else if (poengsum<89 && poengsum>=0) {
			System.out.print("karakter B ");
		}
		else if (poengsum<100 && poengsum>=0) {
			System.out.print("karakter A ");
		}
		else { System.out.print("Ugyldig verdi");

		}
	}
}
