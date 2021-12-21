public class Cliente extends Persona{
    private int idCliente;
    private static int contadorCliente;
    private String tipo;

    public Cliente() {
        super();
        this.idCliente = ++Cliente.contadorCliente;
    }

    public Cliente(String tipo) {
        this(); //llamo al constructor vacio.
        this.tipo = tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
