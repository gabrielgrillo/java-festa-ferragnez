package com.ferragnez;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		
		String [] invitets =  {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
		                      "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone",
		                      "Rachel Zeilic", "gabriel"};
		
		System.out.println("Inserisci il tuo nome");
		nome = scan.next();
		
		for (int i = 0; i < invitets.length; i++) {
			System.out.println(invitets[i]);
					}
		}
	}

