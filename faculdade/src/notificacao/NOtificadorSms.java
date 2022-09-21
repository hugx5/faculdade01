package notificacao;

import services2alga.CLIENTE;

public class NOtificadorSms implements Notificador {

	@Override
	public void notificar(CLIENTE cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS atravese do teleone %s: %s\n", 
	  cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
