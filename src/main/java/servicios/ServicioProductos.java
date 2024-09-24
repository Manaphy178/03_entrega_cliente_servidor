package servicios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import java.util.*;
import daos.*;
import daosImpl.*;
import modelo.*;

@WebServlet("/ServicioProductos")
public class ServicioProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServicioProductos() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		InstrumentosDAO dao = new InstrumentosDAOImpl();
		List<Instrumento> sombrero = dao.obtenerInstrumentos();
//		Ahora tengo que transformar los libros a json para darselos al cliente

		Gson gson = new Gson();
		String json = gson.toJson(sombrero);

		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
