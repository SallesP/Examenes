import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;

import ParcialViajes.Paquetes.IOperator;
import ParcialViajes.Paquetes.Impuesto;
import ParcialViajes.Viajes.Pasaje;

class Test {

	IOperator impuesto;
	Pasaje pasaje;
	
	
	@BeforeEach
	void setUp() throws Exception {
		pasaje = new Pasaje(LocalDate.now(), LocalDate.now(), 1000, "BsAs");
		impuesto = new Impuesto();
		pasaje.setInterfaz(impuesto);
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		
		assertEquals(pasaje.costo(),1100);
	}

}
