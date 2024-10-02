public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                break;

            System.out.println(numero);
        }
        for(int numero1 = 5; numero1 <=10; numero1 ++){
            if(numero1 == 6)
                continue;
    
            System.out.println(numero1);

        }
    }
    
}
