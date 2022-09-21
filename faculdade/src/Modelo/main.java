package Modelo;

import notificacao.NOtificadorSms;
import notificacao.Notificador;
import notificacao.notificadorEmail;
import services.clienteAtivacao;
import services2alga.CLIENTE;

public class main {

	public static void main(String[] args) {
		CLIENTE joao = new CLIENTE("joao","joao@gmail.com", "8599563248");
		CLIENTE maria = new CLIENTE("Maria", "Maria@gmail.com", "88 94562138");
	
		Notificador notificador = new NOtificadorSms();
		
		clienteAtivacao ativacaoCliente = new clienteAtivacao(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		
		
	}
	
}
