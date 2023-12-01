package ParcialSupermercado.MejorCliente;

import java.util.Comparator;
import java.util.List;

import ParcialSupermercado.Cliente.Cliente;

public class MontoConsumido implements MejorCliente {

	@Override
	public Cliente mejorCliente(List<Cliente> clientes) {
		//SE PODRIA AGREGAR UNA VERIFICACION DE QUE LISTA NO ESTE VACIA
		return clientes.stream().max(Comparator.comparingDouble(c -> c.gastoTotal())).orElse(null);
	}


}
