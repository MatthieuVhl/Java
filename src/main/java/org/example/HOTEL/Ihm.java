package org.example.HOTEL;

import java.util.Scanner;

public class Ihm {
    static char mode = ' ';
    String newClient;

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez une information : ");
        System.out.println("1-Ajouter un client ");
        System.out.println("2-Afficherla liste des clients ");
        System.out.println("3-Afficher les réservations d’un client ");
        System.out.println("4-Ajouter une réservation ");
        System.out.println("5-Annuler une réservation ");
        System.out.println("6-Afficher la liste des réservations  ");
         mode = sc.nextLine().charAt(0);

   if( mode == '1'){
       Scanner cl = new Scanner(System.in);
       System.out.println("Saisissez votre Nom : :");
       System.out.println("Saisissez votre Prenom : ");
       System.out.println("Saisissez votre Numéro de téléphone : ");
      String newClient = cl.nextLine();
   } else if (mode == '2') {

   } else if (mode == '3') {

   } else if (mode == '4') {

   }else if (mode == '5') {

   }else if (mode == '6') {

   }
    }



}
