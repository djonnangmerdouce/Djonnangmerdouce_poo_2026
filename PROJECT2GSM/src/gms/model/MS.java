/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gms.model;

/**
 *
 * @author merdouce
 */


import gsm.service.Connectable;
import java.util.ArrayList;

public class MS implements Connectable {

    protected String nom;
    protected String prenom;
    protected String motDePasse;
    protected String msisdn;
    protected String imsi;

    protected ArrayList<Appel> appelsRecus;

    // Constructeur
    public MS(String nom,
              String prenom,
              String motDePasse,
              String msisdn,
              String imsi) {

        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.msisdn = msisdn;
        this.imsi = imsi;

        appelsRecus = new ArrayList<>();
    }

    // Méthode interface
    @Override
    public boolean peutSeConnecter() {

        return msisdn != null && imsi != null;
    }

    // Affichage informations
    public void afficherInfos() {

        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("MSISDN : " + msisdn);
        System.out.println("IMSI : " + imsi);
    }

    // Appeler un autre utilisateur
    public void appeler(MS autreMS, int duree) {

        Appel appel = new Appel(
                this.msisdn,
                autreMS.msisdn,
                duree
        );

        autreMS.appelsRecus.add(appel);
    }

    // Afficher appels reçus
    public void afficherAppelsRecus() {

        for (Appel a : appelsRecus) {

            a.afficherAppel();
        }
    }

    // Getter nom
    public String getNom() {

        return nom;
    }

    // Getter msisdn
    public String getMsisdn() {

        return msisdn;
    }
}
    
    

