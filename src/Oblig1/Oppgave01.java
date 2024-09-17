package Oblig1;

public class Oppgave01 {

	public static void main(String[] args) {
		
		System.out.println("trinskatt");
		
		int trinn1 = 208051;
		int trinn2 = 292850;
		int trinn3 = 670000;
		int trinn4 = 937900;
		int trinn5 = 1350000;
		
		int inntekt = 2000000;
		
		if (inntekt < trinn1) {
			System.out.println("ingen skatt");}
		
		if (inntekt > trinn1 && inntekt <= trinn2) {
			
			System.out.print((inntekt-trinn1)*0.017);}
		
		if (inntekt > trinn2 && inntekt <= trinn3) {
			
			System.out.print(((trinn2-trinn1)*0.017)+(inntekt-trinn2)*0.04);}
		
		if (inntekt > trinn3 && inntekt <= trinn4) {
			
			System.out.print((trinn2-trinn1*0.017)+((trinn3-trinn2)*0.04)+(inntekt-trinn3)*0.136);}
		
		if (inntekt > trinn4 && inntekt <= trinn5) {
			
			System.out.print(((trinn2-trinn1)*0.017)+((trinn3-trinn2)*0.04)+((trinn4-trinn3)*0.136)+(inntekt-trinn4)*0.166);}
		
		if (inntekt >= trinn5) {
			
			System.out.print(((trinn2-trinn1)*0.017)+((trinn3-trinn2)*0.04)+((trinn4-trinn3)*0.136)+((trinn5-trinn4)*0.166)+((inntekt-trinn5)*0.176));}
		
	
	
		
	}
	
}
			
	

