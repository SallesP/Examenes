package ParcialSupermercado.Compra;

import java.time.LocalDate;

public class Compra {

	private LocalDate fechaDeCompra;
	private double montoBase;
	private String metodoDePago;
	private double montoFinal;
	
	
	public Compra(int montoBase, String metodoDePago) {
		this.montoBase = montoBase;
		this.metodoDePago = metodoDePago;
		this.fechaDeCompra = LocalDate.now();
		this.montoFinal = montoBase;
	}
	
	public LocalDate getFechaDeCompra() {
		return fechaDeCompra;
	}
	public void setFechaDeCompra(LocalDate fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}
	public double getMontoBase() {
		return montoBase;
	}
	public void setMontoBase(double montoBase) {
		this.montoBase = montoBase;
	}
	public String getMetodoDePago() {
		return metodoDePago;
	}
	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}
	public double getMontoFinal() {
		return montoFinal;
	}
	public void setMontoFinal(double montoFinal) {
		 this.montoFinal = montoFinal;
	}
	
	
}
