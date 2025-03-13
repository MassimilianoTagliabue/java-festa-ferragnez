package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String username;

        System.out.println("inserisci il tuo nome:");
        username = input.nextLine().toLowerCase().replace(" ", ""); // prendo l'input, tolgo gli spazi e porto tutto in minuscolo
        

        
        for (int i = 0; i < guest.length; i++) {

            if (username.equals(guest[i].toLowerCase().replace(" ", ""))) {
                
                System.out.println("Benvenuto alla festa");
                break;
            }else if(guest.length != i){

                System.out.println("il nome non è stato trovato nella lista");
            }
  
        }

    }
}
