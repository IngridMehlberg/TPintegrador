import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OperacionesIO {

    File salida;

    public OperacionesIO(File output){
        this.salida = output;


    }

    public OperacionesIO() {

    }


    public void documentarVenta(Venta venta) throws IOException {
        FileWriter fw = new FileWriter(this.salida,true);
        BufferedWriter bw = new BufferedWriter(fw);

        ObjectMapper objectMapper = new ObjectMapper();
        JavaTimeModule javaTimeModule=new JavaTimeModule();
        // Hack time module to allow 'Z' at the end of string (i.e. javascript json's)
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ISO_DATE_TIME));
        objectMapper.registerModule(javaTimeModule);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        bw.write(objectMapper.writeValueAsString(venta));

        System.out.println("Se guardó la venta.");


    }
    public Vehiculo traerVehiculo(String id){


        return null;
    }


}
