package ParcialEmpresa.Obra;

import java.util.List;

import ParcialEmpresa.Material.Material;
import ParcialEmpresa.Operario.Operario;
import ParcialEmpresa.Proyecto.Componente;
import ParcialEmpresa.CompraMaterial.*;

public class Obra implements Componente {

	public List<Material> materiales;
	public List<Operario> operarios;
	public CompraMaterial formaDeCompra;
	
	@Override
	public double costo() {
		return this.costoTotalOperarios() + this.costoTotalMateriales();
	}

	@Override
	public void agregar(Componente componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(Componente componente) {
		// TODO Auto-generated method stub
		
	}
	
	public void setCompraMaterial(CompraMaterial formaDeCompra) {
		this.formaDeCompra = formaDeCompra;
	}

	public double costoTotalOperarios() {
		return operarios.stream().mapToDouble(o -> o.costo()).sum();
	}
	
	public double costoTotalMateriales() {
		return formaDeCompra.costoMaterial(this.materiales);
	}
	

}
