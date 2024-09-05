package ar.edu.ies6.informatica.punto05;
import java.util.Date;

import ar.edu.ies6.informatica.punto05.model.Persona;
import java.time.*;
public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
 
		//  Crear un objeto Persona usando el constructor por defecto
		Persona unaPersona = new Persona();
        
        unaPersona.setDni("16345655");
        unaPersona.setNombre("Juan Perez");
        unaPersona.setFechaNacimiento(LocalDate.of(2000, 5, 15));
        unaPersona.setProvincia("Buenos Aires");
        unaPersona.mostrarDatos();  
        System.out.println(); 

        // Crear un objeto Persona usando el constructor parametrizado (todos los atributos)
        Persona otraPersona = new Persona("87654321", "Maria Lopez", LocalDate.of(1995, 8, 20),"Córdoba");
        otraPersona.mostrarDatos();  
        System.out.println(); 

        // Crear un objeto Persona usando el constructor con dni, nombre y fecha de nacimiento
        Persona persona3 = new Persona("11223344", "Carlos Gomez", LocalDate.of(2010, 12, 10));
        persona3.mostrarDatos();  
    }
}