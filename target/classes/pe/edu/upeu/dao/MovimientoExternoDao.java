package dao;

import entity.MovimientoExterno;

public interface MovimientoExternoDao {
	int create(MovimientoExterno a,double monto);
	List<MovimientoExternoDao> readAll;

}
