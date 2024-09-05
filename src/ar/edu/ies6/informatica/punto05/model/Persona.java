package ar.edu.ies6.informatica.punto05.model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	// Atributos privados
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;
    //Los cronstructores me permiten crear objetos del tipo persona con los atributos asignados
   
    // Constructor por defecto
    public Persona() {
    	
    }

	// Constructor parametrizado (todos los atributos)
    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    // Constructor que inicializa dni, nombre y fecha de nacimiento. Provincia = "Jujuy"
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    // metodos accesores (Getters y Setters)
    
    // recibir
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    } 
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getProvincia() {
        return provincia;
    }
    //asignar
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Método para calcular la edad
    public int calcularEdad() {
      
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
       
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        int edad = calcularEdad();
        System.out.println("Edad: " + edad);
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}

