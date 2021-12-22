import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperacionesIO op = new OperacionesIO();

        //        --venta vender --vendedor 3 --vehiculo1 124145627457 --output \desktop\ventas.csv

        ArgumentParser parser = ArgumentParsers.newFor("Proyecto Utn").build()
                .defaultHelp(true)
                .description("Concesionaria");
        parser.addArgument("--venta").type(String.class).required(true);
        parser.addArgument("--vehiculo").type(String.class).required(true);


        Namespace ns = null;

        try {
            ns = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        if (ns.getString("venta").equals("vender")){
            System.out.println("Vendido!");
        }else{
            System.out.println("noup.");
        }


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
