package AutodromoExemplo;

public class Carro extends Veiculo {
    // Sobrescreve o método ligar para comportamento específico de Carro
    @Override
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
}
