public class Deposito extends Inventario {
    private int idDeposito;
    private static int contadorDeposito;

    public Deposito() {
        super();
        this.idDeposito = ++contadorDeposito;
    }

}
