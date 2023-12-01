package ParcialEmpresa.Transporte;

import java.util.List;

import ParcialEmpresa.Proyecto.Componente;

public class Transporte implements Componente {

	private int distancia;
	private int pesoCarga;
	private double precio;
	
	@Override
	public double costo() {
		return this.distancia * this.pesoCarga * this.precio;
	}


	@Override
	public void agregar(Componente componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(Componente componente) {
		// TODO Auto-generated method stub
		
	}
	
}