package ParcialEmpresa.Proyecto;

import java.util.List;

public class Proyecto implements Componente{

	List<Componente> componentes;

	@Override
	public double costo() {
		double costoTotal = 0;
		for (Componente componente : componentes) {
			costoTotal += componente.costo();
		}
		return costoTotal * 1.20;
	}

	@Override
	public void agregar(Componente componente) {
		componentes.add(componente);
		
	}

	@Override
	public void sacar(Componente componente) {
		componentes.remove(componente);
	}

	
}
