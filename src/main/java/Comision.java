public class Comision {
    private Empleado idEmpleado;
    private Venta idVenta;
    private final int idComision;
    private static int contadorComision;

    public Comision() {
        this.idComision = ++ contadorComision;
    }

    public Comision(Empleado idEmpleado, Venta idVenta) {
        this ();
        this.idEmpleado = idEmpleado;
        this.idVenta = idVenta;
    }

    public double calcularComision() {

        return 0;
    }

}
