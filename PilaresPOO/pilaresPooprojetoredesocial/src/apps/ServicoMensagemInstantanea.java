package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarconectadoInternet() {
		System.out.println("Validando a internet");
	}

}

