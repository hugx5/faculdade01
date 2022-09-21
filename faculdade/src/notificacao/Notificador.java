package notificacao;

import services2alga.CLIENTE;

public interface Notificador {

	
void notificar(CLIENTE cliente, String mensagem);
}
