import java.time.LocalDate;

public class Venta {
    private int idVenta;
    private static int contadorVenta;
    private LocalDate fecha;
    private Vehiculo vehiculo;
    //private  itemVenta[] item; //no sabemos o no discutimos como hacerlo
    private Vendedores vendedor;

    public Venta() {
        this.idVenta = ++ contadorVenta;
    }
    public Venta(Vendedores vendedor,Vehiculo vehiculo,LocalDate fecha){



    }


    public void setVendedor(Vendedores vendedor) {
        this.vendedor = vendedor;
    }


    public void setVehiculo(Vehiculo vehiculo){


    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;

    }
    public void agregarItemVenta() {

    }
}
