package main;
import java.util.Scanner;
import model.Bank;

public class Main {
	public static Scanner reader=new Scanner (System.in);
	public static Bank bank=new Bank();
	
	public static int menu() {
		int opt=0;
		System.out.println("1. Dar turno"
				+ "\n2. Mostrar turno"
				+ "\n3. Pasar turno"
				+ "\n4. Eliminar turno actual"
				+ "\n5. Mostrar lista");
		opt=reader.nextInt();
		return opt;
	}
	
	public static void giveTurn() {
		bank.giveTurn();
	}
	
	public static void showTurn() {
		System.out.println(bank.showTurn());
	}
	
	public static void passTurn() {
		bank.passTurn();
	}
	
	public static void deleteTurn() {
		bank.deleteTurn();
	}
	public static void showList() {
		System.out.println(bank.showList());
	}
	public static void main(String[] args) {
		int opt=-1;
		
		while(opt!=0) {
			opt=menu();
			switch (opt) {
			case 1: giveTurn();
				break;
			case 2: showTurn();
				break;
			case 3: passTurn();
				break;
			case 4: deleteTurn();
				break;
			case 5: showList();
				break;
			}
		}
	}
}
