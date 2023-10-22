package ejerciciosWeb.FToledo;

// https://jesusfernandeztoledo.com/ejercicios-resueltos-iniciacion-a-java/

// Realiza un programa en Java que lea dos números pasados por teclado en un proceso repetitivo. Este proceso terminará cuando los números leídos sean iguales.

import java.util.Scanner;

public class FToledo003 {
	
	static Scanner miScan = new Scanner(System.in);
	static String sNum = "", sNum2 = "";
	static int iNum = -1, iNum2 = -1;

	public static void main(String[] args) {
		
		System.out.println("Introduzca el primer número: ");
		sNum = miScan.nextLine();
		iNum = Integer.parseInt(sNum);
		
		System.out.println("Introduzca el primer número: ");
		sNum2 = miScan.nextLine();
		iNum2 = Integer.parseInt(sNum2);
		
		if(iNum == iNum2) {
			
			System.out.println("No se puede ejecutar el programa con esa propuesta... ");
			
		}else if(iNum > iNum2) {
			
			int i = 0;
			
			do {
				
				System.out.println(iNum);
				System.out.println(iNum2);
				iNum2++;
				
			}while(iNum2 <= iNum);
			
		}else {
			
			int i = 0;
			
			do {
				
				System.out.println(iNum2);
				System.out.println(iNum);
				iNum++;
				
			}while(iNum <= iNum2);
			
		}
		

	}

}
