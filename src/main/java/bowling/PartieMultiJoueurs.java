/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bowling;

/**
 *
 * @author maevadesfours
 */
public class PartieMultiJoueurs extends PartieMonoJoueur implements IPartieMultiJoueurs {
	private String[] nomsJoueurs;


	public PartieMultiJoueurs(String[] nomsDesJoueurs){
		this.nomsJoueurs=nomsDesJoueurs;;
	}

	public String demarreNouvellePartie(String[] nomsDesJoueurs){
		for(var i= 0; i < nomsDesJoueurs.length; i++) {
			System.out.println("Prochain tir : joueur "+nomsDesJoueurs[i]+" , tour n° " +numeroTourCourant()
				+", boule n° "+i);
		}
	}
	

