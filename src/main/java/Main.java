import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCrear EmpleadoDao = new EmpleadoCrear();
        List<Empleado> empleados = EmpleadoDao.seleccionar();
        for (Empleado empleado: empleados){
            System.out.println(empleado);
        }
    }
}
