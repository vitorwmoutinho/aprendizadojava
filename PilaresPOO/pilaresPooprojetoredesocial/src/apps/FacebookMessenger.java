package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarconectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando Facebook");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo Facebook");
		
	}
	

}
