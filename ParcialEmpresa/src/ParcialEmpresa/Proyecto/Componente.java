package ParcialEmpresa.Proyecto;

import java.util.List;

public interface Componente {

	abstract public double costo();
	abstract public void agregar(Componente componente);
	abstract public void sacar(Componente componente);
	
	
}
