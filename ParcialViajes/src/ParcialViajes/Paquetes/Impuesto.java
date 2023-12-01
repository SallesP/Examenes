package ParcialViajes.Paquetes;

import java.time.LocalDate;

public class Impuesto implements IOperator{

	@Override
	public float taxes(String aeropuerto, LocalDate fechaInicio) {
		return 100;
	}

	
}
