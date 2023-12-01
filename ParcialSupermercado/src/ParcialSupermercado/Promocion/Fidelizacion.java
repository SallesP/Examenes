package ParcialSupermercado.Promocion;

import java.time.LocalDate;
import ParcialSupermercado.enviarMensaje.*;

import ParcialSupermercado.Cliente.Cliente;
import ParcialSupermercado.Compra.Compra;

public class Fidelizacion implements Promocion{

	MailSender mensajero;
	
	@Override
	public void aplicarBeneficio(Cliente cliente, Compra compra) {
		//PREGUNTAR COMO SABER SI ES SU ULTIMA COMPRA
		if (this.esFechaAnteriorUltimaCompra(compra)) {
			compra.setMontoFinal(compra.getMontoBase());
			mensajero.enviarMail("email", "Gracias por elegirnos", "Gracias por permanecer con nosotros");
		}
		else {
			compra.setMontoFinal(compra.getMontoBase());
		}
	}
	


	private boolean esFechaAnteriorUltimaCompra(Compra compra) {

        return compra.getFechaDeCompra().isBefore(LocalDate.now());
    }

	public boolean esFidelizado() {
		return true;
	}
}
