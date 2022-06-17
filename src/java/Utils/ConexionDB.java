
package Utils;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConexionDB {

        public static Connection getConexion(){
            String username = "root";
            String password = "";
            String hostname = "localhost";
            String port = "3306";
            String database = "clinicajsp";
            String classname = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
            Connection conn=null;
            try {
                Class.forName(classname);
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Conexión satisfactoria");
            } catch (Exception e) {
                System.out.println("Error de conexión: " + e);
            }
            return conn;
        }
        
        public static void main(String[] args) {

            getConexion();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println(dtf.format(LocalDateTime.now()));
        }
}
