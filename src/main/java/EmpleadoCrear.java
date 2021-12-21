import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class EmpleadoCrear implements EmpleadoDao {

        private Connection connectionTransaccional;

        private static final String SQL_SELECT = "SELECT * FROM persona";
        private static final String SQL_INSERT = "INSERT INTO empleado(nombre,apellido,cuit,dni,cargo,sueldo,residencia,telefono,mail,bloqueado) VALUES(?,?,?,?,?,?, ?, ?, ?)";
        private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, mail = ?, telefono = ? WHERE id_persona = ?";
        private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

        public EmpleadoCrear() {

        }

        public EmpleadoCrear(Connection conexionTransaccional){
            this.connectionTransaccional = conexionTransaccional;
        }

        public List<Empleado> seleccionar() {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            Empleado persona = null;
            List<Empleado> empleados = new ArrayList<>();

            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(SQL_SELECT);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    int idPersona = rs.getInt("id_persona");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String mail = rs.getString("mail");
                    String telefono = rs.getString("telefono");

                    Empleado empleado = new Empleado();
                    empleados.add(empleado);
                }

            }
            catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            finally {
                try {
                    Conexion.close(rs);
                    Conexion.close(stmt);
                    Conexion.close(conn);
                }
                catch (SQLException e) {
                    e.printStackTrace(System.out);
                }
            }
            return empleados;
        }
        public int insertar(Empleado empleado){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(SQL_INSERT);
                stmt.setString(1, empleado.getNombre());
                stmt.setString(2, empleado.getApellido());
                stmt.setString(3, empleado.getMail());
                stmt.setString(4, empleado.getTelefono());
                registros = stmt.executeUpdate();//para que actualize el estado en la base de datos.

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            finally {
                try {
                    Conexion.close(stmt);
                    Conexion.close(conn);
                } catch (SQLException e) {
                    e.printStackTrace(System.out);
                }

            }

            return registros;
        }

        public int actualizar (Empleado empleado){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(SQL_UPDATE);
                stmt.setString(1, empleado.getNombre());
                stmt.setString(2, empleado.getApellido());
                stmt.setString(3, empleado.getMail());
                stmt.setString(4, empleado.getTelefono());
                stmt.setInt(5, empleado.getIdEmpleado());
                registros = stmt.executeUpdate();//para que actualize el estado en la base de datos.

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            finally {
                try {
                    Conexion.close(stmt);
                    Conexion.close(conn);
                } catch (SQLException e) {
                    e.printStackTrace(System.out);
                }

            }

            return registros;
        }
        public int eliminar (Empleado empleado){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(SQL_DELETE);
                stmt.setInt(1, empleado.getIdEmpleado());
                registros = stmt.executeUpdate();//para que actualize el estado en la base de datos.

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            finally {
                try {
                    Conexion.close(stmt);
                    Conexion.close(conn);
                } catch (SQLException e) {
                    e.printStackTrace(System.out);
                }

            }

            return registros;
        }

        @Override
        public List<Empleado> select() {
            return null;
        }

        @Override
        public int insert(Empleado empleado) throws SQLException {
            return 0;
        }

        @Override
        public int update(Empleado empleado) throws SQLException {
            return 0;
        }

        @Override
        public int delete(Empleado empleado) throws SQLException {
            return 0;
        }
    }
