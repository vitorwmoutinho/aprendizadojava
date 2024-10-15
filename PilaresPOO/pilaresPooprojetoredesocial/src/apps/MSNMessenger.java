package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarconectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando MSN");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo MSN");
		
	}
	

}

