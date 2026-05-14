/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gms.model;

/**
 *
 * @author merdouce
 */


import gsm.exception.BTSException;
import java.util.ArrayList;

public class BTS {

    private int numero;
    private String emplacement;
    private double hauteur;
    private String typeMilieu;
    private double rayonCouverture;
    private double puissanceEmission;
    private int nombreMaxUtilisateurs;

    private ArrayList<MS> utilisateurs;

    public BTS(int numero,
               String emplacement,
               double hauteur,
               String typeMilieu,
               double rayonCouverture,
               double puissanceEmission,
               int nombreMaxUtilisateurs) {

        this.numero = numero;
        this.emplacement = emplacement;
        this.hauteur = hauteur;
        this.typeMilieu = typeMilieu;
        this.rayonCouverture = rayonCouverture;
        this.puissanceEmission = puissanceEmission;
        this.nombreMaxUtilisateurs = nombreMaxUtilisateurs;

        utilisateurs = new ArrayList<>();
    }

    public void ajouterMS(MS ms)
            throws BTSException {

        if (utilisateurs.size()
                >= nombreMaxUtilisateurs) {

            throw new BTSException(
                    "BTS saturee !");
        }

        utilisateurs.add(ms);
    }

    public void supprimerMS(String msisdn) {

        utilisateurs.removeIf(ms ->
                ms.getMsisdn()
                        .equals(msisdn));
    }

    public MS rechercherMS(String msisdn) {

        for (MS ms : utilisateurs) {

            if (ms.getMsisdn()
                    .equals(msisdn)) {

                return ms;
            }
        }

        return null;
    }

    public boolean estSaturee() {

        return utilisateurs.size()
                >= nombreMaxUtilisateurs;
    }

    public void afficherInfos() {

        System.out.println("Numero : "
                + numero);

        System.out.println("Emplacement : "
                + emplacement);

        System.out.println("Hauteur : "
                + hauteur + " m");

        System.out.println("Type milieu : "
                + typeMilieu);

        System.out.println("Rayon : "
                + rayonCouverture + " km");

        System.out.println("Puissance : "
                + puissanceEmission + " W");

        System.out.println("Utilisateurs : "
                + utilisateurs.size()
                + "/"
                + nombreMaxUtilisateurs);

        if (estSaturee()) {

            System.out.println("Etat : SATUREE");

        } else {

            System.out.println("Etat : NON SATUREE");
        }
    }

    public int getNombreUtilisateurs() {

        return utilisateurs.size();
    }

    public String getEmplacement() {

        return emplacement;
    }
}
    
    

