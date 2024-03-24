public class Main {
    public static void main(String[] args){
        
        double n1, n2, n3, n4, res;
        
        System.out.print("Informe a nota 1: ");
        n1 = Double.parseDouble(System.console().readLine());
        
        System.out.print("Informe a nota 2: ");
        n2 = Double.parseDouble(System.console().readLine());
        
        System.out.print("Informe a nota 3: ");
        n3 = Double.parseDouble(System.console().readLine());
        
        System.out.print("Informe a nota 4: ");
        n4 = Double.parseDouble(System.console().readLine());
        
        res = (n1 + n2 + n3 + n4) / 4;
        
        System.out.printf("Média das notas = %.1f\n", res);
        
        // Implementação SE...ENTÃO em JAVA
        
        if(res >= 7)
            System.out.println("Aluno aprovado!");
            
        else
            System.out.println("Aluno reprovado!");
    }
}
