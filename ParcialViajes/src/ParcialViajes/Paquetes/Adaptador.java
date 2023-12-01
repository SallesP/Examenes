package ParcialViajes.Paquetes;

import java.time.LocalDate;

public class Adaptador implements IOperator {

	IOpInternational Iop;

	@Override
	public float taxes(String aeropuerto, LocalDate fechaInicio) {
		// TODO Auto-generated method stub
		return Iop.currentTaxes(aeropuerto, fechaInicio);
	}
	
	
}
