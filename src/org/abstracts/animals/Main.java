package org.abstracts.animals;

public class Main {
	public static void main(String[] args) {
		
		Cane c1 = new Cane("Crocchette", "bau bau");
		Passerotto p1 = new Passerotto("Semi", "più più");
		Acquila a1 = new Acquila("Coniglio", "SIUUUU");
		Delfino d1 = new Delfino("Pesci", "Addio e grazie per tutto il pesce");
		
		System.out.println("Il cane dorme?");
		System.out.println("\ndi sottofondo: " + c1.dormi());
		
		System.out.println("--------------------------");
		System.out.println("Il mondo sta per finire, dove sono finiti i delfini?");
		System.out.println("\nHanno lasciato un bigliettino: " + "'" + d1.getVerso() + "'");
		
		System.out.println("--------------------------");
		System.out.println("Cosa mangia un'acquila?");
		System.out.println("\nL'acquila: " + a1.getCibo());
	
	}
	
	public static void faiNuotare(INuotante animale) {
		
		animale.nuota();
	}
}
