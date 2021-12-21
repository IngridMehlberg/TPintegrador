import java.time.LocalDate;

public class Venta {
    private int idVenta;
    private static int contadorVenta;
    private LocalDate fecha;
    //private  itemVenta[] item; //no sabemos o no discutimos como hacerlo
    private Cliente cliente;
    private Vendedores vendedor;

    public Venta() {
        this.idVenta = ++ contadorVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedores getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedores vendedor) {
        this.vendedor = vendedor;
    }

    public double precioFinal(){

        return 0;
    }
    public void mostrarVenta(){

    }
    public void agregarItemVenta(){

    }
    public void quitarItemVenta(){

    }
    public void bajaStock(){

    }
}
