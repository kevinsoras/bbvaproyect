package entity;

public class MovimientoExterno {
private int idmovimientoexterno;
private int idcliente1;
private int idcliente2;
public int getIdmovimientoexterno() {
	return idmovimientoexterno;
}
public void setIdmovimientoexterno(int idmovimientoexterno) {
	this.idmovimientoexterno = idmovimientoexterno;
}
public int getIdcliente1() {
	return idcliente1;
}
public void setIdcliente1(int idcliente1) {
	this.idcliente1 = idcliente1;
}
public int getIdcliente2() {
	return idcliente2;
}
public void setIdcliente2(int idcliente2) {
	this.idcliente2 = idcliente2;
}
public MovimientoExterno(int idcliente1, int idcliente2) {
	super();
	this.idcliente1 = idcliente1;
	this.idcliente2 = idcliente2;
}
public MovimientoExterno() {
	super();
}

}
