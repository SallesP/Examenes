package ParcialSupermercado.Promocion;

import ParcialSupermercado.Cliente.Cliente;
import ParcialSupermercado.Compra.Compra;

public class Bienvenida implements Promocion {

	private int cantidadDeDescuentos = 10;
	private double descuento;
	
	@Override
	public void aplicarBeneficio(Cliente cliente, Compra compra) {
		if (cantidadDeDescuentos != 0) {
			compra.setMontoFinal(this.calcularDescuento(compra));
			this.cantidadDeDescuentos -= 1;
		}
		else {
//			Estado = new Consolidacion();
//			cliente.setestadoCliente(Estado);
			compra.setMontoFinal(this.calcularDescuento(compra));
		}
	}
	
	private double calcularDescuento(Compra compra) {
		return compra.getMontoBase() * this.descuento;
	}
	
	public boolean esFidelizado() {
		return false;
	}




}
