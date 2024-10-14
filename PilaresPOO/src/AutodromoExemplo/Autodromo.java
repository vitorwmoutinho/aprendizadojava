package AutodromoExemplo;

public class Autodromo {
    public static void main(String[] args) {
        // Instancia um Carro e uma Moto como Veículos
        Veiculo jeep = new Carro();
        jeep.setChassi("88888");
        jeep.ligar(); // Chama o método ligar de Carro

        Veiculo z400 = new Moto();
        z400.setChassi("7777");
        z400.ligar(); // Chama o método ligar de Moto

        // Também podemos usar polimorfismo para tratar veículos de forma genérica
        Veiculo veiculoGenerico = z400; // Pode ser qualquer Veiculo
        veiculoGenerico.ligar(); // Polimorfismo: método de Moto será chamado
    }
}
