package ParcialViajes.Viajes;

import java.time.LocalDate;

import ParcialViajes.Paquetes.Producto;

public abstract class Viaje implements Producto{

	LocalDate fechaSalida;
	LocalDate fechaLlegada;
	
	public Viaje (LocalDate fechaSalida, LocalDate fechaLlegada) {
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
	}
	
	public LocalDate getFechaInicio() {
		return fechaSalida;
	}

	public LocalDate getFechaLlegada() {
		return fechaLlegada;
	}
	public abstract double costo();
}
