package ejerciciosWeb.FToledo;

import java.util.Scanner;

//  https://jesusfernandeztoledo.com/ejercicios-resueltos-iniciacion-a-java/

// Realiza un programa en Java que lea dos números pasados por teclado y muestre la suma por pantalla.
 

public class FToledo001 {
	
	static Scanner miScan = new Scanner(System.in);
	static String sNum = "", sNum2 = "";
	static int iNum = -1, iNum2 = -1, iSuma = 0;;

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer número: ");
		sNum = miScan.nextLine();
		iNum = Integer.parseInt(sNum);
		
		System.out.println("Introduzca el segundo número: ");
		sNum2 = miScan.nextLine();
		iNum2 = Integer.parseInt(sNum2);
		
		iSuma = iNum + iNum2;
		
		System.out.println(iSuma);

	}

}
