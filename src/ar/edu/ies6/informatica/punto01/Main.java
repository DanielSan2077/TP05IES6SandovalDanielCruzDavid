package ar.edu.ies6.informatica.punto01;

public class Main {
	public static void main(String[] args) {
		
    String nombrePais= "Argentina";
	int edadPersona= 23;
	double alturaEdificio= 14.6;
	double precioProducto= 2000;
	String numeroTelefono= "3885567299";
	double coseno= Math.cos(0.5);
			
    int num1 = 8;
    int num2 = 5;
    int num3 = 7;
    int num4 = 10;
    int num5 = 4;

    // Cálculo del promedio
    double promedio = (num1 + num2 + num3 + num4 + num5) / 5.0;
    System.out.println("El nombre del país es: " + nombrePais);
    System.out.println("La edad de la persona es: " + edadPersona);
    System.out.println("La altura del edificio es: " + alturaEdificio + " metros");
    System.out.println("El precio del producto es: $" + precioProducto);
    System.out.println("El número de teléfono es: " + numeroTelefono);
    System.out.println("El coseno de 0.5 es: " + coseno);
    System.out.println("Los números son: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
    System.out.println("El promedio es: " + promedio);
	}

}