package iphone.funcionalidades.aparelhotelefonico;

public class AparelhoTelefonico {
    public void ligar(){
        verificaSinal();
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz");
    }

    private void verificaSinal(){
        System.out.println("Verifica sinal");
    }

}
