package AutodromoExemplo;

public class Moto extends Veiculo {
    // Sobrescreve o método ligar para comportamento específico de Moto
    @Override
    public void ligar() {
        System.out.println("A moto está ligada.");
    }
}

