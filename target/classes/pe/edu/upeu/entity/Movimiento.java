package entity;

public class Movimiento {
private int idmovimiento;
private double monto;
private double saldoinicial;
private double saldofinal;
public int getIdmovimiento() {
	return idmovimiento;
}
public void setIdmovimiento(int idmovimiento) {
	this.idmovimiento = idmovimiento;
}
public double getMonto() {
	return monto;
}
public void setMonto(double monto) {
	this.monto = monto;
}
public double getSaldoinicial() {
	return saldoinicial;
}
public void setSaldoinicial(double saldoinicial) {
	this.saldoinicial = saldoinicial;
}
public double getSaldofinal() {
	return saldofinal;
}
public void setSaldofinal(double saldofinal) {
	this.saldofinal = saldofinal;
}
public Movimiento(int idmovimiento, double monto, double saldoinicial, double saldofinal) {
	super();
	this.idmovimiento = idmovimiento;
	this.monto = monto;
	this.saldoinicial = saldoinicial;
	this.saldofinal = saldofinal;
}
public Movimiento(double monto, double saldoinicial, double saldofinal) {
	super();
	this.monto = monto;
	this.saldoinicial = saldoinicial;
	this.saldofinal = saldofinal;
}
public Movimiento() {
	super();
}


}
