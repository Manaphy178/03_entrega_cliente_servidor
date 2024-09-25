package servlets.admin;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.InstrumentosDAO;
import daosImpl.InstrumentosDAOImpl;
import modelo.Instrumento;

@WebServlet("/admin/ServletListarInstrumento")
public class ServletListarInstrumento extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Se ejecuta el metodo doget del servlet, "
				+ "aqui veremos como acceder a BD y obtener los productos " + "que mostrar en portada");
		InstrumentosDAO i = new InstrumentosDAOImpl();
		List<Instrumento> instrumento = i.obtenerInstrumentos();
		request.setAttribute("info", instrumento);
		RequestDispatcher rd = request.getRequestDispatcher("instrumentos.jsp");
		rd.forward(request, response);
	}

}
