package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClienteDao;
import daoimp.ClienteDaoImp;
import entity.Cliente;

/**
 * Servlet implementation class MenuController
 */
@WebServlet("/menuc")
public class MenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private ClienteDao cliente = new ClienteDaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        int op = 1;
	        String clave = request.getParameter("cc");
	        HttpSession sesion = request.getSession();
	        RequestDispatcher rd;
	        Cliente datos = new Cliente();
	        switch(op){
	            case 1: if(cliente.Validar(clave).getIdcliente()>0) {
	            		datos = cliente.Validar(request.getParameter("cc"));
	            		sesion.setAttribute("idcliente", datos.getIdcliente());
	            		sesion.setAttribute("nombre", datos.getNombre());
	            		sesion.setAttribute("apellido", datos.getApellido());
	            		sesion.setAttribute("saldo", datos.getSaldo());
	            		sesion.setAttribute("cuenta", datos.getCuenta());
	            		sesion.setAttribute("contrasena", datos.getContrasena());
                    
	            		rd= request.getRequestDispatcher("/Menu");
	            		rd.forward(request, response);
                    
	                     }else {
	                    	 rd= request.getRequestDispatcher("/Inicio");
	 	                    rd.forward(request, response);
	 	                     
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
