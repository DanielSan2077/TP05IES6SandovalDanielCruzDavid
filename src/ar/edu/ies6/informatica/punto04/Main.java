package ar.edu.ies6.informatica.punto04;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese un número entero entre 1 y 9: ");
	if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
    
    if (numero < 1 || numero > 9) {
        System.out.println("El número debe estar entre 1 y 9.");
    } else {
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        int i = 1;
        for (;i <= 10;) { //Mientras
            System.out.println(numero + " x " + i + " = " + (numero * i));
        i++;
        }
	 }
    scanner.close();
	} else {
		System.out.print("Se ingresó un dato incorrecto");
	}
	 }
}
