package ParcialViajes.Paquetes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Paquete implements Producto{

	LocalDate fechaSalida;
	LocalDate fechaLlegada;
	double costoPaquete;
	double costoGestion;
	List<Producto> productos;
	
	

	public Paquete(LocalDate fechaSalida,LocalDate fechaLlegada,double costoPaquete,double costoGestion) {
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.costoPaquete = costoPaquete;
		this.costoGestion = costoGestion;
		this.productos = new ArrayList<>();
	}

	public LocalDate getFechaLlegada() {
		return fechaLlegada;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void removerProducto(Producto producto) {
		productos.remove(producto);
	}
	
	public double costo() {
		double costo = productos.stream().mapToDouble(p -> p.costo()).sum() + this.costoPaquete;
		return costo + this.costoGestion;
	}
	
	@Override
	public LocalDate fechaSalida() {
		return productos.stream().map(p -> p.fechaSalida()).min((LocalDate::compareTo)).orElse(fechaSalida);
	}
	
	@Override
	public LocalDate fechaLlegada() {

		return productos.stream().map(p -> p.fechaLlegada()).max((LocalDate::compareTo)).orElse(fechaLlegada);
	}
	
}
