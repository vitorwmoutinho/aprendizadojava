package AutodromoExemplo;

public class Carro extends Veiculo {
    public void ligar() {
    confereCambio();
    confereCombustivel();
    System.out.println("Carro ligado");
}
public void confereCombustivel() {
    System.out.println("Verifica combustivel");
}
public void confereCambio() {
    System.out.println("Cambio ok!");
}

}
