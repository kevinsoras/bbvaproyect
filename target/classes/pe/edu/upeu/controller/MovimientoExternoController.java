package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MovimientoExternoDao;
import dao.MovimientoInternoDao;
import daoimp.MovimientoExternoDaoImp;
import daoimp.MovimientoInternoDaoImp;
import entity.MovimientoExterno;
import entity.MovimientoInterno;

/**
 * Servlet implementation class MovimientoExternoController
 */
@WebServlet("/mec")
public class MovimientoExternoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MovimientoExternoDao move = new MovimientoExternoDaoImp();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovimientoExternoController() {
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
		PrintWriter out = response.getWriter();
		HttpSession sesion = request.getSession();
		RequestDispatcher rd;
		int op = Integer.parseInt(request.getParameter("opt"));
		int idc = Integer.parseInt(request.getParameter("idcli1"));
		int idc2 = Integer.parseInt(request.getParameter("idcli2"));
		double cant = Double.parseDouble(request.getParameter("cant"));
		switch (op) {
		case 1:
			if (cant > 0) {
				MovimientoExterno a = new MovimientoExterno(idc, idc2);
				move.create(a, cant);
				out.println(1);

			} else {
				out.print(0);
			}

			break;
		case 2: 
			
			
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
