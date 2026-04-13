package inheritance;

public class Employee extends Person {
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Employee(double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++Employee.contadorEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Sueldo: " + this.sueldo + ", ID: " + this.idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", " + super.toString() +
                '}';
    }
}
