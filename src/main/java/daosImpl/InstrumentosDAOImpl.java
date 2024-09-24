package daosImpl;

import java.sql.*;
import java.util.*;

import constantesSQL.ConstantesSQL;
import modelo.*;
import daos.InstrumentosDAO;
import masterDAO.MasterDAO;

public class InstrumentosDAOImpl extends MasterDAO implements InstrumentosDAO {
	public List<Instrumento> obtenerInstrumentos() {
		super.conectar();
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		Statement st;
		try {
			st = super.getCon().createStatement();
			ResultSet rs = st.executeQuery(ConstantesSQL.SQL_OBTENER_INSTRUMENTOS);
			while (rs.next()) {
				Instrumento i = new Instrumento();
				i.setId(rs.getInt("id"));
				i.setNombre(rs.getString("nombre"));
				i.setTipo(rs.getString("tipo"));
				i.setMarca(rs.getString("marca"));
				i.setGamma(rs.getString("gamma"));
				i.setDesc(rs.getString("description"));
				i.setPrecio(rs.getDouble("precio"));
				instrumentos.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.desconectar();
		return instrumentos;
	}

	@Override
	public void registrarInstrumento(Instrumento i) {
		super.conectar();
		try {
			PreparedStatement ps = super.getCon().prepareStatement(ConstantesSQL.SQL_REGISTRAR_INSTRUMENTO);
			ps.setString(1, i.getNombre());
			ps.setString(2, i.getTipo());
			ps.setString(3, i.getMarca());
			ps.setString(4, i.getDesc());
			ps.setString(5, i.getGamma());
			ps.setDouble(6, i.getPrecio());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.desconectar();
	}

	@Override
	public void borrarInstrumento(int id) {
		super.conectar();
		try {
			PreparedStatement ps = super.getCon().prepareStatement(ConstantesSQL.SQL_BORRAR_INSTRUMENTOS);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Esta la mal la sql de borrar");
			e.printStackTrace();
		}
		super.desconectar();

	}

	@Override
	public void editarInstrumento(Instrumento i) {
		// TODO Auto-generated method stub

	}

}
