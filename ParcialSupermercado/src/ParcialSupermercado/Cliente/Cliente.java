package ParcialSupermercado.Cliente;

import ParcialSupermercado.Promocion.*;
import ParcialSupermercado.Supermercado.Supermercado;

import java.util.ArrayList;
import java.util.List;

import ParcialSupermercado.Compra.Compra;

public class Cliente {

	List<Compra> listaDeCompras = new ArrayList<>();
	Promocion estadoCliente = new Bienvenida();
	Supermercado supermercadoActual;
	
	
	public void agregarCompra(Compra compra) {
		this.estadoCliente.aplicarBeneficio(this , compra);
		listaDeCompras.add(compra);
	}
	
	public Promocion getEstado() {
		return this.estadoCliente;
	}
	
	public void setestadoCliente(Promocion estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public List<Compra> getListaDeCompras() {
		return listaDeCompras;
	}
	
	public double gastoTotal() {
		return this.listaDeCompras.stream().mapToDouble(c -> c.getMontoFinal()).sum();
	}
	
	public double totalDeCantidadDeCompras() {
		return this.listaDeCompras.size();
	}

	public boolean estaFidelizado() {
		return this.estadoCliente.esFidelizado();
	}
	
	
	
}
