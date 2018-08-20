package daoimp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.Conexion;
import dao.MovimientoExternoDao;
import entity.MovimientoExterno;

public class MovimientoExternoDaoImp implements MovimientoExternoDao{
	private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
	@Override
	public int create(MovimientoExterno a, double monto) {
		int x =0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call crearMovimientoInterno(?,?,?)}");
            cst.setInt(1,a.getIdcliente1());
            cst.setInt(2,a.getIdcliente2());
            cst.setDouble(3,monto);
            x = cst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;
	}

}
