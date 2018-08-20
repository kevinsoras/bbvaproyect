package pe.edu.upeu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controlador
 */
public class controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson g = new Gson();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int op = Integer.parseInt(request.getParameter("opc"));
        switch(op){
            case 1:
                out.println(g.toJson(d.listarDevolucion()));
                break;
            case 2:
                 Prestamo pre = new Prestamo(Integer.parseInt(request.getParameter("idprestamo")),Integer.parseInt(request.getParameter("idproducto")));

                 pres.update(pre);
                 break;
            case 3: 
                Devon kop = new Devon(request.getParameter("det"),Integer.parseInt(request.getParameter("idpro")));
                k.create(kop);
                break;
            case 5:
                 out.println(g.toJson(d.ListarProductosByFecha(request.getParameter("fecha"),request.getParameter("nom"),request.getParameter("ape"))));
                 break;
            case 6: out.print(g.toJson(k.listt()));
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
