package apps;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarconectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando Telegram");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo Telegram");
		
	}
	

}
