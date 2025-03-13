package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String username;
        boolean isFound = false;
        int index = 0;

        System.out.println("inserisci il tuo nome:");
        username = input.nextLine().toLowerCase().replace(" ", ""); // prendo l'input, tolgo gli spazi e porto tutto in minuscolo

        // for (int i = 0; i < guest.length; i++) {
        // if (username.equals(guest[i].toLowerCase().replace(" ", ""))) { //equals per
        // confrontare le stringhe

        // System.out.println("Benvenuto alla festa");
        // isFound = true;
        // break;
        // }
        // }

        while (index < guest.length && !isFound) {

            if (username.equals(guest[index].toLowerCase().replace(" ", ""))) {
                System.out.println("Benvenuto alla festa");
                isFound = true;
            }
            index++;
        }

        if(isFound == false){
        System.out.println("non sei presente sulla lista dei partecipanti");
        }
    }
}
