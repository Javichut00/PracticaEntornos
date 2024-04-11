package GitHub;

	/**
	 * Esta clase otorga una persona pero de tipo Empleado con sus propios atributos
	 * @author javin
	 * @version 1.0
	 * @since 31/03/2024
	 */

public class Empleado extends Persona {
	
	private String cargo;
    private double salario;
    
    /**
     * Constructor para crear un objeto Empleado con un nombre, una edad, un cargo y un salario.
     * @param nombre El nombre del empleado.
     * @param edad La edad del empleado.
     * @param cargo El cargo del empleado.
     * @param salario El salario del empleado.
     */
    
    public Empleado(String nombre, int edad, String cargo, double salario) {
        super(nombre, edad);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    /**
     * Obtiene el cargo del empleado.
     * @return El cargo del empleado.
     */
    
    public String getCargo() {
        return cargo;
    }
    
    /**
     * Obtiene el salario del empleado.
     * @return El salario del empleado.
     */
    
    public double getSalario() {
        return salario;
    }
    
    /**
     * Simula que el empleado está trabajando imprimiendo un mensaje en la consola.
     */
    
    public void trabajar() {
        System.out.println("Soy " + getCargo() + " y estoy trabajando.");
    }
    
    /**
     * Recibe un aumento en el salario del empleado.
     * @param aumento El aumento en el salario.
     */
    
    public void recibirAumento(double aumento) {
        salario += aumento;
        System.out.println("¡He recibido un aumento! Mi nuevo salario es: " + salario + "€");
    }
}
