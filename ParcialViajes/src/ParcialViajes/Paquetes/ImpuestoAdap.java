package ParcialViajes.Paquetes;

import java.time.LocalDate;

public class ImpuestoAdap implements IOpInternational {

	@Override
	public float currentTaxes(String aeropuerto, LocalDate fechaInicio) {
		// TODO Auto-generated method stub
		return 50000;
	}

}
