package masterDAO;

import java.sql.*;

public class MasterDAO {
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mysql://localhost/bd_tienda_instrumentos", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("La libreria no esta disponible o no se incluyo");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error de conexion, comprueba el codigo");
		}
	}// END CONECTAR

	public void desconectar() {
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// END DESCONECTAR

}
