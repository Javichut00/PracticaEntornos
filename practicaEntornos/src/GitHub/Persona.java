package GitHub;
	
	/**
	 * Esta clase otorga una persona con un nombre y una edad que realiza algunas acciones de persona
	 * @author javin
	 * @version 1.0
	 * @since 31/03/2024
	 */

public class Persona {
	
	private String nombre;
    private int edad;
    
    /**
     * Constructor para crear un objeto Persona con un nombre y una edad.
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     */
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * 
     * @return Devuelve el nombre de persona
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return Devuelve la edad de persona
     */
    
    public int getEdad() {
        return edad;
    }
    
    /**
     * Este metodo muestra un mensaje en el que la persona saluda diciendo su nombre
     */
    
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
    
    /**
     * Este metodo incrementa la edad cada vez que cumple años y devuelve un mensaje sobre su nueva edad
     */
    
    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }
}
