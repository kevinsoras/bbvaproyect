package dao;

import entity.Cliente;

public interface ClienteDao {
	public Cliente readCliente(int key);
	Cliente searchCliente(String cuenta);
	Cliente Validar(String n);
	
	
}
