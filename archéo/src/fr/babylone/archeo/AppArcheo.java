package fr.babylone.archeo;

import fr.babylone.archeo.entites.Site;
import fr.babylone.archeo.entites.ZoneFouille;

public class AppArcheo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZoneFouille zof1  = new ZoneFouille(1, "Cramont") ;
		
		System.out.println("N°"+""+zof1.getNumero() +" " + zof1.getVille());
		
		System.out.println("Zone de fouille :"+" "+zof1.getVille());
		
		System.out.println("N°"+""+zof1.getNumero());
		
		System.out.println(zof1.toString());
		
		zof1.setVille("Prouville");
		
		System.out.println(zof1.getVille());
		
		System.out.println(zof1.toString());
		
	// Site //
		
		Site st1 = new Site(1,4,3,zof1);
		
		System.out.println(st1.toString());
		
		System.out.println(st1.getZone());
		
		System.out.println(st1.getLongueur() +" "+ st1.getZone());
		
		System.out.println(st1.getSuperficie());
		
		System.out.println(st1.getZone().getVille());
	}

		
	
}
