/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gms.model;

/**
 *
 * @author merdouce
 */

public class Appel {

    private String numeroAppelant;
    private String numeroRecepteur;
    private int duree;

    public Appel(String numeroAppelant,
                 String numeroRecepteur,
                 int duree) {

        this.numeroAppelant = numeroAppelant;
        this.numeroRecepteur = numeroRecepteur;
        this.duree = duree;
    }

    public void afficherAppel() {

        System.out.println(numeroAppelant
                + " -> "
                + numeroRecepteur
                + " : "
                + duree
                + " min");
    }
}
    
