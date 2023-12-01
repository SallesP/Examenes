package ParcialEmpresa.CompraMaterial;

import java.util.List;

import ParcialEmpresa.Material.Material;

public class Efectivo implements CompraMaterial {

	
	
	@Override
	public  double costoMaterial(List<Material> materiales) {
		return materiales.stream().mapToDouble(m -> m.costoTotal()).sum();
	}

	

}
