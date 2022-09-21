package services;

import notificacao.Notificador;
import services2alga.CLIENTE;

public class clienteAtivacao {

	private Notificador notificador;
	
	public clienteAtivacao(Notificador notificador) {
		this.notificador = notificador;
	}
	
public void ativar(CLIENTE cliente) {
	cliente.ativar();
	this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");

	
}
	
}
