import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Kamila", "Lucas", "Bruna", "Pedro"};

        int media = calculaMediaTurma(alunos, scan);
        System.out.printf("Media da turma %d: ", media);

    }
    public static int calculaMediaTurma(String[] alunos, Scanner scanner){

        int soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %S: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
