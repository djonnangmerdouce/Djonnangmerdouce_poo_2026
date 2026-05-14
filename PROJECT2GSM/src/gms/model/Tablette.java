/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gms.model;

/**
 *
 * @author merdouce
 */


public class Tablette extends MS {

    private double tailleEcran;

    public Tablette(String nom,
                    String prenom,
                    String motDePasse,
                    String msisdn,
                    String imsi,
                    double tailleEcran) {

        super(nom,
              prenom,
              motDePasse,
              msisdn,
              imsi);

        this.tailleEcran = tailleEcran;
    }

    @Override
    public void afficherInfos() {

        super.afficherInfos();

        System.out.println("Taille ecran : "
                + tailleEcran);
    }
}
    
    

