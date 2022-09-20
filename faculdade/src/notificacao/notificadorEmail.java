package notificacao;

import services2alga.CLIENTE;

public class notificadorEmail {

	public void notificar(CLIENTE cliente, String mensagem) {
	System.out.printf("Notificando %s através do e-mal %s: %s\n", cliente.getEmail(), cliente.getNome(), mensagem);
}


}