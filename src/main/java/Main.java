import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperacionesIO op = new OperacionesIO();
//        --venta vender --vendedor 3 --vehiculo1 124145627457 --output \desktop\ventas.csv
        LecturaDb lecturaDb = new LecturaDb();
        Venta venta = new Venta();


        venta.setVendedor(lecturaDb.traerVendedor("4"));
        venta.setVehiculo(lecturaDb.traerVehiculo("3"));
        venta.setFecha(LocalDate.now());

        try{

            op.documentarVenta(venta);
        }catch(IOException e){
            e.printStackTrace();
        }



    }
}
