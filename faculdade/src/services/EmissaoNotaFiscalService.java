package services;

import notificacao.Notificador;
import services2alga.CLIENTE;
import services2alga.produto;

public class EmissaoNotaFiscalService {

	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}

	
	public void emitir(CLIENTE cliente, produto produto) {
		
		this.notificador.notificar(cliente, "Nota fiscal do produto "
		+ produto.getNome() + " foi emitida");	}
}
