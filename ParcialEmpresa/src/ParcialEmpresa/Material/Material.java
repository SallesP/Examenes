package ParcialEmpresa.Material;

public class Material {

	public int cantidad;
	public double precioUni;
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
	
	
	public double costoTotal() {
		return this.cantidad * this.precioUni;
	}
	
}
