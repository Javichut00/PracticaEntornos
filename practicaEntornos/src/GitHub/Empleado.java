package GitHub;

public class Empleado extends Persona {
	
	private String cargo;
    private double salario;
    
    public Empleado(String nombre, int edad, String cargo, double salario) {
        super(nombre, edad);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void trabajar() {
        System.out.println("Soy " + getCargo() + " y estoy trabajando.");
    }
}
