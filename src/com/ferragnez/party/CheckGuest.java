package com.ferragnez.party;
import java.util.Scanner;


public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] guest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String username;

        System.out.println("inserisci il tuo nome:");
        username = input.nextLine().toLowerCase().replace(" ", "");   //prendo l'input, tolgo gli spazi e porto tutto in minuscolo

        System.out.println(username);
    }
}
