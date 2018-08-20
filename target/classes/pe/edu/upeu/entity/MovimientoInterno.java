package entity;

public class MovimientoInterno {
private int idmovimientointerno;
private int idcliente;
private String tipo;
public int getIdmovimientointerno() {
	return idmovimientointerno;
}
public void setIdmovimientointerno(int idmovimientointerno) {
	this.idmovimientointerno = idmovimientointerno;
}
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public MovimientoInterno(int idmovimientointerno, int idcliente, String tipo) {
	super();
	this.idmovimientointerno = idmovimientointerno;
	this.idcliente = idcliente;
	this.tipo = tipo;
}
public MovimientoInterno(int idcliente, String tipo) {
	super();
	this.idcliente = idcliente;
	this.tipo = tipo;
}
public MovimientoInterno() {
	super();
}

}
