package test;

import com.google.gson.Gson;

import Util.Conexion;
import dao.ClienteDao;
import dao.MovimientoExternoDao;
import dao.MovimientoInternoDao;
import daoimp.ClienteDaoImp;
import daoimp.MovimientoExternoDaoImp;
import daoimp.MovimientoInternoDaoImp;
import entity.MovimientoExterno;
import entity.MovimientoInterno;

public class test {
	public static Gson g= new Gson();
	public static ClienteDao cli = new ClienteDaoImp();
	public static MovimientoInternoDao mi= new MovimientoInternoDaoImp();
	public static MovimientoExternoDao me= new MovimientoExternoDaoImp();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conect();
		validar();
	}
	public static void conect() {
		if(Conexion.getConexion()!=null) {
			System.out.print("conectasss ");
		}
	}
	public static void validar() {
		System.out.println(g.toJson(cli.searchCliente("123456789")));
	}

}
