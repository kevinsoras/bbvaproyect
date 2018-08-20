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

import dao.MovimientoInternoDao;
import daoimp.MovimientoInternoDaoImp;
import entity.MovimientoInterno;

/**
 * Servlet implementation class MovimientoInternoController
 */
@WebServlet("/mic")
public class MovimientoInternoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private MovimientoInternoDao mov = new MovimientoInternoDaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovimientoInternoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession sesion = request.getSession();
		RequestDispatcher rd;
        int op = Integer.parseInt(request.getParameter("opt"));
        int idc=Integer.parseInt(request.getParameter("idcli"));
        String tipo = request.getParameter("tipo");
        double cant = Double.parseDouble(request.getParameter("cant"));
        switch(op){
            case 1: 
            		if(cant>0) {
            			MovimientoInterno a = new MovimientoInterno(idc,tipo);
                		mov.create(a,cant);
                		out.println(1);
    					
            		}else {
            			out.print(0);
            		}
            		
            		break;
            		
                    
            
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
