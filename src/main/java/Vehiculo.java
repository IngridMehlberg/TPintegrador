public class Vehiculo {
    private String marca;
    private String categoria;
    private String tipoVehiculo;
    private String modelo;
    private String color;
    private boolean disponible;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String categoria, String tipoVehiculo, String modelo, String color, boolean disponible, double precio) {
        this.marca = marca;
        this.categoria = categoria;
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
        this.color = color;
        this.disponible = disponible;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", disponible=" + disponible +
                ", precio=" + precio +
                '}';
    }
}
