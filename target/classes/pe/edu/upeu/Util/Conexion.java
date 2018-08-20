package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
 private static final String URL = "jdbc:mysql://localhost:3306/cajero";
 private static final String DRIVER = "com.mysql.jdbc.Driver";
 private static final String USER = "root";
 private static final String CLAVE = "1412";
 private static Connection cx = null;
 public static Connection getConexion() {
	 try {
		 Class.forName(DRIVER);
		 if(cx==null) {
			 cx = DriverManager.getConnection(URL, USER, CLAVE);
		 }
	} catch (Exception e) {
		System.out.println(e);
	}
	 
	 return cx;
 }
}
