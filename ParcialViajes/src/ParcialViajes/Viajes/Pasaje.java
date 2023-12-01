package ParcialViajes.Viajes;
import ParcialViajes.Paquetes.*;

import java.time.LocalDate;

public class Pasaje extends Viaje{

	double costoPorPersona;
	String aeropuerto;
	IOperator interfaz;
	
	public Pasaje(LocalDate fechaSalida, LocalDate fechaLlegada, double costo, String aeropuerto) {
		super(fechaSalida, fechaLlegada);
		this.costoPorPersona = costo;
		this.aeropuerto = aeropuerto;
	}

	@Override
	public double costo() {
		return this.costoPorPersona + this.interfaz.taxes(this.aeropuerto, this.fechaSalida);
	}


	@Override
	public LocalDate fechaSalida() {
		return this.fechaSalida;
	}

	@Override
	public LocalDate fechaLlegada() {
		return this.fechaLlegada;
	}

	public void setInterfaz(IOperator impuesto) {
		this.interfaz = impuesto;
	}


}
