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
	@Override
    public List<MovimientoInternodao> readAll() {
        List<MovimientoInterno> movi = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ListarMovimientoExterno (?)}");
            rs = cs.executeQuery();
            while (rs.next()) {
                MovimientoInterno miv = new MovimientoInterno();
                cst.setInt(1,a.getIdcliente1());
                miv.setIdmovimientointerno(rs.getInt(1));
                miv.setIdcliente(rs.getInt(2));
                p.setIdprestamo(rs.getInt(1));
                p.setEstado(rs.getInt(2));
                p.setNom_alumno(rs.getString(4));
                p.setAula(rs.getString(6));
                p.setFe_prestamo(rs.getString(3));
                p.setFe_devolucion(rs.getString(5));
                p.setHora_pre(rs.getString(10));
                p.setHora_devo(rs.getString(11));
                p.setId_profe(rs.getInt(7));
                p.setId_documento(rs.getInt(8));
                p.setId_user(rs.getInt(9));
                p.setNom_user(rs.getString(12));
                p.setNom_profe(rs.getString(13));
                
                pre.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return pre;
    }

}
