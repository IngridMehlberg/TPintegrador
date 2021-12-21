public class Inventario {
    private Vehiculo idVehiculo;
    private Deposito idDeposito;
    private int cantidad;
    private boolean disponible;

    public Inventario() {
    }

    public Inventario(Vehiculo idVehiculo, Deposito idDeposito, int cantidad, boolean disponible) {
        this.idVehiculo = idVehiculo;
        this.idDeposito = idDeposito;
        this.cantidad = cantidad;
        this.disponible = disponible;
    }
    public int agregarStock(){
        return 0;
    }
    public boolean bloquearStock(boolean disponible){
        return true;
    }

}
