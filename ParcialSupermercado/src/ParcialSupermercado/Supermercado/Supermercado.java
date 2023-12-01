package ParcialSupermercado.Supermercado;
import java.util.ArrayList;
import java.util.List;

import ParcialSupermercado.Cliente.*;
import ParcialSupermercado.Compra.Compra;
import ParcialSupermercado.MejorCliente.MejorCliente;

public class Supermercado {

	List<Cliente> clientes;
	MejorCliente mejorCliente;
	
	public List<Compra> obtenerTodasLasCompras() {
		return clientes.stream().flatMap(c -> c.getListaDeCompras().stream()).toList();
	}
	
	public Cliente elGanadorEs() {
		
		return mejorCliente.mejorCliente(this.clientes);
	}
	
	public void setMejorCliente(MejorCliente estrategia) {
		this.mejorCliente = estrategia;
	}
	
	public List<Cliente> filtrarListaPorFidelizado() {
		return clientes.stream().filter(c -> c.estaFidelizado()).toList();
	}

	
}
