package iphone.aparelho;

import iphone.dispositivo.Dispositivo;
import iphone.funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import iphone.funcionalidades.navegadorinternet.Safari;
import iphone.funcionalidades.reprodutormusical.ipod;

public class Iphone extends Dispositivo implements AparelhoTelefonico, Safari, ipod {
    public Iphone(String marca, String modelo){
        super(marca, modelo);
    }
    //função Ipod
    public void tocar(){
        System.out.println("Reproduzindo música!");
    }
    public void pausar(){
        System.out.println("Música pausada.");

    }
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }
    //Função telefone
    public void ligar(String numero){
        System.out.println("Ligando " + numero);

    }
    public void atender(){
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz");
    }
    //Função Safari
    public void exibirPagina(String siteurl){
        System.out.println("Exibindo página: " + siteurl);
        
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }


}
