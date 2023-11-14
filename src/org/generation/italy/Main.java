package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// da qui si inizia a scrivere il codice
String nome, cognome; // dichiaro due variabili String
int eta, peso;  // dichiaro due variabili intere
float altezza, bmi; // dichiaro due variabili decimali
Scanner sc=new Scanner(System.in); //serve per input utente
System.out.println("Benvenuto! Come ti chiami?");//usare syso ctrl+spazio e diventa System.out.println()
System.out.print("Nome: ");//senza ln non va a capo
nome=sc.nextLine(); //input string dall utente, sc sta per scanner.
System.out.print("Cognome: ");
cognome=sc.nextLine();
System.out.print("Età: ");
eta=Integer.parseInt(sc.nextLine());//input int dall utente, sc sta per scanner.
System.out.print("Peso: ");
peso=Integer.parseInt(sc.nextLine());//input int dall utente, sc sta per scanner.
System.out.print("altezza: ");
altezza=Float.parseFloat(sc.nextLine()); //input double dall utenteDA
bmi=peso/(altezza*altezza); //assegnazione
System.out.println("BMI: " + bmi);//output bmi
System.out.println("I tuoi dati sono:"); 
System.out.println("Nome: "+ nome);
System.out.println("Cognome: "+ cognome);
System.out.println("Età: "+ eta);
System.out.println("Peso: "+ peso);
System.out.println("Altezza: "+ altezza);
System.out.println("BMI: "+ bmi);

if(bmi<25)
//parte vera primo if
	if(bmi<=18.5)
		//parte vera secondo if
		System.out.println("sei sottopeso");
//parte falsa secondo if
	else
		System.out.println("sei normopeso");
//parte falsa primo if
else
	if(bmi>=29.9)
		if(bmi>34.9)
			System.out.println("sei estremamente sovrappeso");
		else
			System.out.println("sei obeso");
	else
		System.out.println("sei sovrappeso");

	}

}
