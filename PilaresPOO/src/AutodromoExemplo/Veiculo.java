package AutodromoExemplo;

public class Veiculo {
    private String chassi; // Mantém o campo privado para encapsulamento

    // Método setter para definir o chassi
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Método getter para acessar o chassi
    public String getChassi() {
        return chassi;
    }

    // Método ligar (será sobrescrito nas subclasses)
    public void ligar() {
        System.out.println("O veículo está ligado.");
    }
}

