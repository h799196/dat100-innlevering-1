package Oblig1;

import javax.swing.JOptionPane;

public class Oppgave03 {

	public static void main(String[] args) {
		
		String melding = "skriv inn tall du vil finne fakultet av";
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(melding));
		
		int i = 1;
		int f = 1;
		
		System.out.print(n+"! = ");
		
		do {
		
		f*=i;
		
		System.out.print(i+"*");
		
		i++;
		}
		
		while (i<=n) ;
		
		System.out.print(" = "+f);


		}
	}
