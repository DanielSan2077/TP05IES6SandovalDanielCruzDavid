
package ar.edu.ies6.informatica.punto02;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            
            int resultado = numero * 3;
            System.out.println("El número es par. El triple del número es: " + resultado);
        } else {
          
            int resultado = numero * 2;
            System.out.println("El número es impar. El doble del número es: " + resultado);
        }
      

        scanner.close();
	}

}