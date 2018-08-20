package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangeController
 */
@WebServlet("/changec")
public class ChangeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int op = Integer.parseInt(request.getParameter("op"));
		
		RequestDispatcher rd;
		switch (op) {
		case 1:
			rd = request.getRequestDispatcher("consultasaldo.jsp");
			rd.forward(request, response);
			break;
		case 2:
			rd = request.getRequestDispatcher("tipodeposito.jsp");
			rd.forward(request, response);
			break;
		case 3:
			rd = request.getRequestDispatcher("realizadeposito.jsp");
			rd.forward(request, response);
			break;
		case 4:
			rd = request.getRequestDispatcher("transferencia.jsp");
			rd.forward(request, response);
			break;
		case 5:
			rd = request.getRequestDispatcher("realizarretiro.jsp");
			rd.forward(request, response);
			break;
		case 6:
			rd = request.getRequestDispatcher("menu.jsp");
			rd.forward(request, response);
			break;
		case 7:

			rd = request.getRequestDispatcher("realizadeposito.jsp");
			rd.forward(request, response);

			break;

		case 8:
			rd = request.getRequestDispatcher("depositofinalizada.jsp");
			rd.forward(request, response);
			break;
		case 9:
			rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			break;
		case 10:
			rd = request.getRequestDispatcher("retirofinalizado.jsp");
			rd.forward(request, response);
			break;
		case 11:
			rd = request.getRequestDispatcher("ultimosmovimientos.jsp");
			rd.forward(request, response);
			break;

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
