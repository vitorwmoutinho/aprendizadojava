import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o nome do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Recebe o nome do cliente e os serviços contratados
        String clienteEServicos = scanner.nextLine().trim();

        // Divide a linha do cliente e serviços contratados usando vírgula
        String[] dados = clienteEServicos.split(",");

        // O primeiro item é o nome do cliente, o restante são os serviços
        String cliente = dados[0];
        boolean contratouServico = false;

        // Verifica se o serviço está entre os serviços contratados pelo cliente
        for (int i = 1; i < dados.length; i++) {
            if (dados[i].equalsIgnoreCase(servico)) {
                contratouServico = true;
                break;
            }
        }

        // Exibe "Sim" se o serviço foi contratado, ou "Nao" caso contrário
        if (contratouServico) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
