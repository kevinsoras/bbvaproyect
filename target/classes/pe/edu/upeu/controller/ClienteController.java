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

import com.google.gson.Gson;

import dao.ClienteDao;
import daoimp.ClienteDaoImp;
import entity.MovimientoExterno;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/clientec")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   private Gson g = new Gson();
       private ClienteDao cli = new ClienteDaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
        int op = Integer.parseInt(request.getParameter("opt"));
        String ccector = request.getParameter("cuenta");
        System.out.println(ccector);
        switch(op){
            case 1: out.println(g.toJson(cli.searchCliente(ccector)));
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
