package ParcialViajes.Viajes;

import java.time.LocalDate;


public class Excursion extends Viaje{
	
	double precioPorPersona = 10;
	double impuesto;

	public Excursion(LocalDate fechaSalida, LocalDate fechaLlegada, double precioPorPersona, double impuesto) {
		super(fechaSalida, fechaLlegada);
		this.precioPorPersona = precioPorPersona;
		this.impuesto = impuesto;
	}
	
	public double costo() {
		return this.precioPorPersona + this.impuesto;
	}


	@Override
	public LocalDate fechaSalida() {
		return this.fechaSalida;
	}

	@Override
	public LocalDate fechaLlegada() {
		// TODO Auto-generated method stub
		return this.fechaLlegada;
	}

	
	
}
