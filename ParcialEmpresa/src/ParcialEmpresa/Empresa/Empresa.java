package ParcialEmpresa.Empresa;

import java.util.List;

import ParcialEmpresa.Proyecto.Proyecto;

public class Empresa {

	String nombre;
	String cuit;
	Proyecto proyecto;
	
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public double costoProyecto() {
		return this.proyecto.costo();
	}
	
}
