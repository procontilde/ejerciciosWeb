package ejerciciosWeb.FToledo;

import java.util.Scanner;

//https://jesusfernandeztoledo.com/ejercicios-resueltos-iniciacion-a-java/

// Programa que lea dos números pasados por teclado y muestre el mayor en pantalla. Si son iguales deberá mostrar un mensaje indicándolo.

public class FToledo002 {
	
	static Scanner miScan = new Scanner(System.in);
	static String sNum = "", sNum2 = "";
	static int iNum = -1, iNum2 = -1;

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer número: ");
		sNum = miScan.nextLine();
		iNum = Integer.parseInt(sNum);
		
		System.out.println("Introduzca el segundo número: ");
		sNum2 = miScan.nextLine();
		iNum2 = Integer.parseInt(sNum2);
		
		if(iNum == iNum2) {
			
			System.out.println("Los números son iguales.");
			
		}else if(iNum > iNum2) {
			
			System.out.println("El número más alto es " + iNum);
		
		}else if(iNum > iNum2) {
			
			System.out.println("El número más alto es " + iNum2);
		
		}else {
			
			System.out.println("No digo ná.");
		}

	}

}
