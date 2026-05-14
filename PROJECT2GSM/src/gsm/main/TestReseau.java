/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsm.main;

/**
 *
 * @author merdouce
 */
;

import gsm.exception.BTSException;
import gsm.model.*;

public class TestReseau {

    public static void main(String[] args) {

        try {

            System.out.println("===== PROJET GSM -merdouce =====");

            // Création du réseau
            Reseau reseau = new Reseau(
                    "MTN CAMEROUN",
                    "890-915 MHz",
                    "935-960 MHz",
                    "FDMA/TDMA",
                    50.0,
                    100.0,
                    20
            );

            // Création BTS
            BTS bts1 = new BTS(
                    1,
                    "Bafoussam",
                    35.0,
                    "Urbain",
                    5.0,
                    40.0,
                    2
            );

            BTS bts2 = new BTS(
                    2,
                    "Douala",
                    30.0,
                    "Urbain",
                    4.0,
                    35.0,
                    3
            );

            // Ajout BTS au réseau
            reseau.ajouterBTS(bts1);
            reseau.ajouterBTS(bts2);

            // Création utilisateurs
            Smartphone MERDOUCEe = new Smartphone(
                    "DJONNANG",
                    "Junior",
                    "pass1",
                    "696351009",
                    "IMSI001",
                    "Android"
            );

            Smartphone annaelle= new Smartphone(
                    "ANNELLE",
                    "Grâce",
                    "pass2",
                    "655190527",
                    "IMSI002",
                    "Android"
            );

            Tablette djonnang = new Tablette(
                    "DJONNANG",
                    "Paul",
                    "pass3",
                    "677889900",
                    "IMSI003",
                    10.5
            );

            // Connexion BTS
            bts1.ajouterMS(merdouce);
            System.out.println("djonnang connecte a la BTS 1");

            bts1.ajouterMS(djonnang);
            System.out.println("annaelleconnecte a la BTS 1");

            bts2.ajouterMS(djonnang);
            System.out.println("merdouceconnecte a la BTS 2");

            // Appel
            merdouce.appeler(merdouce, 5);

            System.out.println("\ndjonnang appelle merdouce");

            // Informations BTS
            System.out.println("\n===== BTS =====");

            bts1.afficherInfos();

            // Informations réseau
            System.out.println("\n===== RESEAU GSM =====");

            reseau.afficherPerformances();

            System.out.println("Nombre BTS : 2");

            System.out.println("Nombre abonnes : "
                    + reseau.nombreTotalAbonnes());

            // Affichage appels reçus
            System.out.println("\n=== Appels recus de MERDOUCE ===");

            MERDOUCE.afficherAppelsRecus();

        } catch (BTSException e) {

            System.out.println(e.getMessage());
        }
    }
}

