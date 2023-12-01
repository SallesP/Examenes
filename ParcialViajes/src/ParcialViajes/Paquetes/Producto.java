package ParcialViajes.Paquetes;

import java.time.LocalDate;

public interface Producto {

	public double costo();
	public LocalDate fechaSalida();
	public LocalDate fechaLlegada();
}
