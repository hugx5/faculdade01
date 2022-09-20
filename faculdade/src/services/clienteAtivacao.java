package services;

import notificacao.notificadorEmail;
import services2alga.CLIENTE;

public class clienteAtivacao {

public void ativar(CLIENTE cliente) {
	cliente.ativar();
	notificadorEmail notificador = new notificadorEmail();
	notificador.notificar(cliente, "seu cadastro no sistema esta ativo.");
		

	
}
	
}
