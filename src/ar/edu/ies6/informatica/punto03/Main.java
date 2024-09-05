package ar.edu.ies6.informatica.punto03;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero entero entre 0 y 10: ");
     if (scanner.hasNextInt()) {
		int numero= scanner.nextInt();
		
	    if (numero<0 || numero>10) {
		
		System.out.print("El numero debe estar entre 0 y 10");
		
	} else {
		int factorial=1;
		
		int i = numero;
		while (i>1) {
			factorial *= i; //factorial = factorial *i;
			i--;  //i= i-1
		}
		
		System.out.println("El factorial de "+numero+" es: "+factorial);
		
	}
	scanner.close();
	} else {
		System.out.print("Se ingresó un dato incorrecto");
	}
	}

}