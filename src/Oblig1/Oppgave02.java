package Oblig1;

public class Oppgave02 {

	public static void main(String[] args) {
		
		System.out.println("Trinskatt du må betale ");
		
		double trinn1 = 208051;
		double trinn2 = 292850;
		double trinn3 = 670000;
		double trinn4 = 937900;
		double trinn5 = 1350000;
		
		double inntekt = 2000000;
		
		if (inntekt < trinn1) {
			
			System.out.println("ingen skatt");}
		
		else if (inntekt > trinn1 && inntekt <= trinn2) {
			
			System.out.print((inntekt-trinn1)*0.017);}
		
		else if (inntekt > trinn2 && inntekt <= trinn3) {
			
			System.out.print(((trinn2-trinn1)*0.017)+(inntekt-trinn2)*0.04);}
		
		else if (inntekt > trinn3 && inntekt <= trinn4) {
			
			System.out.print((trinn2-trinn1*0.017)+((trinn3-trinn2)*0.04)+(inntekt-trinn3)*0.136);}
		
		else if (inntekt > trinn4 && inntekt <= trinn5) {
			
			System.out.print(((trinn2-trinn1)*0.017)+((trinn3-trinn2)*0.04)+((trinn4-trinn3)*0.136)+(inntekt-trinn4)*0.166);}
		
		else {
			
			System.out.print(((trinn2-trinn1)*0.017)+((trinn3-trinn2)*0.04)+((trinn4-trinn3)*0.136)+((trinn5-trinn4)*0.166)+((inntekt-trinn5)*0.176));}
		
		System.out.print("kr");
	}
	
}
			
	

