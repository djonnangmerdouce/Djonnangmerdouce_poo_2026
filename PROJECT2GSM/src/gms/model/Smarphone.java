/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gms.model;

/**
 *
 * @author merdouce
 */


public class Smartphone extends MS {

    private String systeme;

    public Smartphone(String nom,
                      String prenom,
                      String motDePasse,
                      String msisdn,
                      String imsi,
                      String systeme) {

        super(nom,
              prenom,
              motDePasse,
              msisdn,
              imsi);

        this.systeme = systeme;
    }

    @Override
    public void afficherInfos() {

        super.afficherInfos();

        System.out.println("Systeme : "
                + systeme);
    }
}
    

