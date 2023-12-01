package ParcialSupermercado.enviarMensaje;

public interface MailSender {

	public void enviarMail(String mailDestinatario, String titulo, String cuerpo);
	
}
