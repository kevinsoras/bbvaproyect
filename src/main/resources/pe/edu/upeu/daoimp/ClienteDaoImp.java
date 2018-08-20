package daoimp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.Conexion;
import dao.ClienteDao;
import entity.Cliente;
public class ClienteDaoImp implements ClienteDao {
	private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
	@Override
	public Cliente readCliente(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente searchCliente(String cuenta) {
		 Cliente op= new Cliente();
	        try {
	            cx = Conexion.getConexion();
	            cst = cx.prepareCall("{call searchCliente(?)}");
	            cst.setString(1, cuenta);
	            rs = cst.executeQuery();
	            while(rs.next()){
	               op.setApellido(rs.getString("apellido"));
	               op.setContrasena(rs.getString("contrasena"));
	               op.setCuenta(rs.getString("cuenta"));
	               op.setIdcliente(rs.getInt("idcliente"));
	               op.setNombre(rs.getString("nombre"));
	               op.setSaldo(rs.getDouble("Saldo"));
	            }
	        } catch (SQLException e) {
	            System.out.println("Error:"+ e);
	        }
	        //call searchId(4);
	        return op; 
	}

	@Override
	public Cliente Validar(String n) {
		 Cliente op= new Cliente();
	        try {
	            cx = Conexion.getConexion();
	            cst = cx.prepareCall("{call validarCliente(?)}");
	            cst.setString(1, n);
	            rs = cst.executeQuery();
	            while(rs.next()){
	               op.setApellido(rs.getString("apellido"));
	               op.setContrasena(rs.getString("contrasena"));
	               op.setCuenta(rs.getString("cuenta"));
	               op.setIdcliente(rs.getInt("idcliente"));
	               op.setNombre(rs.getString("nombre"));
	               op.setSaldo(rs.getDouble("Saldo"));
	            }
	        } catch (SQLException e) {
	            System.out.println("Error:"+ e);
	        }
	        //call searchId(4);
	        return op; 
	}

}
