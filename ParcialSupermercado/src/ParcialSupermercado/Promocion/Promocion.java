package ParcialSupermercado.Promocion;

import ParcialSupermercado.Cliente.Cliente;
import ParcialSupermercado.Compra.Compra;

public interface Promocion {


	public abstract void aplicarBeneficio(Cliente cliente, Compra compra);
	public abstract boolean esFidelizado();
}
