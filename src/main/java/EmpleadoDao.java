import java.sql.SQLException;
import java.util.List;

public interface EmpleadoDao {


        public List<Empleado> select();

        public int insert(Empleado empleado) throws SQLException;

        public int update(Empleado empleado) throws SQLException;

        public int delete(Empleado empleado) throws SQLException;


}
