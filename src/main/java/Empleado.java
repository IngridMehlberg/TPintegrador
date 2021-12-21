public class Empleado extends Persona {
    private final int idEmpleado;
    private static int contadorEmpleado;
    private String cargo;
    private int sueldo;

    public Empleado() {
        super();
        this.idEmpleado= ++contadorEmpleado;
    }

    public Empleado(String cargo, int sueldo) {
        this();
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
