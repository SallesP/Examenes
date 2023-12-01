package ParcialSupermercado.Promocion;

import ParcialSupermercado.Cliente.Cliente;
import ParcialSupermercado.Compra.Compra;

public class Consolidacion implements Promocion {

	private int cuponesDescuento = 3;

	@Override
	public void aplicarBeneficio(Cliente cliente, Compra compra) {
		if (cuponesDescuento != 0 ) {
			this.aplicarCupon(compra);
		}
		else {
			cliente.setestadoCliente(new Fidelizacion());
		}
	}
	
	private void aplicarCupon(Compra compra) {
		if (compra.getMontoBase() > 50000) {
			 compra.setMontoFinal(compra.getMontoBase() * 0.60);
			 cuponesDescuento -= 1;
		}
		else {
			compra.setMontoFinal(compra.getMontoBase());
		}
	}
	

	@Override
	public boolean esFidelizado() {
		// TODO Auto-generated method stub
		return false;
	}
}
