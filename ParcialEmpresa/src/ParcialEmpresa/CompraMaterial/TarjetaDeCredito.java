package ParcialEmpresa.CompraMaterial;

import java.util.List;

import ParcialEmpresa.Material.Material;

public class TarjetaDeCredito {

	private int cantidadCuotas;
	
	
	public TarjetaDeCredito(int numeroDeCuotas) {
		super();
		this.cantidadCuotas = numeroDeCuotas;
	}
	

	public double costoMaterial(List<Material> materiales) {
		// TODO Auto-generated method stub
		return costoMaterial(materiales) * (cantidadCuotas * 0.4);
	}



}
