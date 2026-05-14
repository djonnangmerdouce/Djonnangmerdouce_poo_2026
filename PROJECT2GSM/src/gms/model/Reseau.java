/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gms.model;

/**
 *
 * @author merdouce
 */


import java.util.ArrayList;

public class Reseau {

    private String nom;
    private String bandeUplink;
    private String bandeDownlink;
    private String accesMultiple;

    private double debitMaxUplink;
    private double debitMaxDownlink;
    private int delaiMax;

    private ArrayList<BTS> listeBTS;

    public Reseau(String nom,
                  String bandeUplink,
                  String bandeDownlink,
                  String accesMultiple,
                  double debitMaxUplink,
                  double debitMaxDownlink,
                  int delaiMax) {

        this.nom = nom;
        this.bandeUplink = bandeUplink;
        this.bandeDownlink = bandeDownlink;
        this.accesMultiple = accesMultiple;

        this.debitMaxUplink = debitMaxUplink;
        this.debitMaxDownlink = debitMaxDownlink;
        this.delaiMax = delaiMax;

        listeBTS = new ArrayList<>();
    }

    public void ajouterBTS(BTS bts) {

        listeBTS.add(bts);
    }

    public void supprimerBTS(BTS bts) {

        listeBTS.remove(bts);
    }

    public BTS rechercherBTS(
            String emplacement) {

        for (BTS b : listeBTS) {

            if (b.getEmplacement()
                    .equalsIgnoreCase(
                            emplacement)) {

                return b;
            }
        }

        return null;
    }

    public int nombreTotalAbonnes() {

        int total = 0;

        for (BTS b : listeBTS) {

            total += b.getNombreUtilisateurs();
        }

        return total;
    }

    public void afficherPerformances() {

        System.out.println("Nom : " + nom);

        System.out.println("Bande UL : "
                + bandeUplink);

        System.out.println("Bande DL : "
                + bandeDownlink);

        System.out.println("Acces multiple : "
                + accesMultiple);

        System.out.println("Debit UL : "
                + debitMaxUplink
                + " Mbps");

        System.out.println("Debit DL : "
                + debitMaxDownlink
                + " Mbps");

        System.out.println("Delai max : "
                + delaiMax + " ms");
    }
}
    
