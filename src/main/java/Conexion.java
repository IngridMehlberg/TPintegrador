import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/proyectoutn";
    private static final String JDBC_USER = "Lucas";
    private static final String JDBC_PASSWORD = "Pasalacqua17";

    public  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

    }
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    public static void close (Statement smtm) throws SQLException {
        smtm.close();
    }
    public static void close (PreparedStatement smtm) throws SQLException {
        smtm.close();
    }
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }

}

