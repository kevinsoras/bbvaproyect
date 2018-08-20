package entity;

public class Cliente {
private int idcliente;
private String nombre;
private String Apellido;
private double saldo;
private String cuenta;
private String contrasena;
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public String getCuenta() {
	return cuenta;
}
public void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}
public String getContrasena() {
	return contrasena;
}
public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}
public Cliente(int idcliente, String nombre, String apellido, double saldo, String cuenta, String contrasena) {
	super();
	this.idcliente = idcliente;
	this.nombre = nombre;
	Apellido = apellido;
	this.saldo = saldo;
	this.cuenta = cuenta;
	this.contrasena = contrasena;
}
public Cliente(String nombre, String apellido, double saldo, String cuenta, String contrasena) {
	super();
	this.nombre = nombre;
	Apellido = apellido;
	this.saldo = saldo;
	this.cuenta = cuenta;
	this.contrasena = contrasena;
}
public Cliente() {
	super();
}

}
