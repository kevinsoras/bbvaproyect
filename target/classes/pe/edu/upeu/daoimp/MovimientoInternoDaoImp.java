package daoimp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.Conexion;
import dao.MovimientoInternoDao;
import entity.MovimientoInterno;

public class MovimientoInternoDaoImp implements MovimientoInternoDao {
	private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
	@Override
	public int create(MovimientoInterno a,double monto) {
		int x =0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call crearMovimientoInterno(?,?,?)}");
            cst.setInt(1,a.getIdcliente());
            cst.setString(2,a.getTipo());
            cst.setDouble(3,monto );
            x = cst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;
	}
	@Override
    public List<MovimientoInternoDao> readAll() {
        List<MovimientoInterno> movin = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ListarMovimientoInterno (?)}");
            rs = cs.executeQuery();
            while (rs.next()) {
                MovimientoInterno miv = new MovimientoInterno();
                cst.setInt(1,a.getIdcliente1());
                miv.setIdmovimientointerno(rs.getInt(1));
                miv.setIdcliente(rs.getInt(2));
                miv.setTipo(rs.getString(3));               
                movin.add(miv);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return movi;
    }

}
