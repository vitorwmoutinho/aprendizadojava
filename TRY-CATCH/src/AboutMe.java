// Tratamento de exceções

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String [] args){
        try{

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        }
        catch(InputMismatchException e){
            System.out.println("Os campos precisam seer númericos.");
        }
    }

}