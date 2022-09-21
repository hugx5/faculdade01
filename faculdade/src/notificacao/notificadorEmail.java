package notificacao;

import services2alga.CLIENTE;

public class notificadorEmail implements Notificador {

	
	@Override
	public void notificar(CLIENTE cliente, String mensagem) {
	System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getEmail(), cliente.getNome(), mensagem);
}


}