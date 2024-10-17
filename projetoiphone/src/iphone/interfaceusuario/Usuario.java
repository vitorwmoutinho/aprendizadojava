package iphone.interfaceusuario;

import iphone.aparelho.Iphone;
import iphone.dispositivo.Dispositivo;
import iphone.funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import iphone.funcionalidades.navegadorinternet.Safari;
import iphone.funcionalidades.reprodutormusical.ipod;

public class Usuario {
    public static void main(String[] args){
        Iphone iphone1 = new Iphone("apple", "iphone 1");

        ipod reprIpod = iphone1;
        reprIpod.selecionarMusica("Imagine");
        reprIpod.tocar();

        AparelhoTelefonico telefone = iphone1;
        telefone.ligar("40028922");
        telefone.atender();

        Safari navegadSafari = iphone1;
        navegadSafari.exibirPagina("www.xlm.com");
        navegadSafari.adicionarNovaAba();
        navegadSafari.exibirPagina("www.bra.com.br");
        navegadSafari.atualizarPagina();


    }

}
