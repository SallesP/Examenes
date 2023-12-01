package ParcialEmpresa.Operario;

public class Operario {

	private int cantidadHoras;
	private double valorPorHora;
	private int antiguedad;
	
	public double costo() {
		return this.extraPorAntiguedad(this.cantidadHoras * this.valorPorHora); 
	}
	
	public double extraPorAntiguedad(double monto) {
		if (antiguedad > 5) {
			return monto * 1.10;
		}
		else {
			return monto;
		}
	}
	
}
