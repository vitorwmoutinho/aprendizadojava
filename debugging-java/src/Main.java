public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciou o programada meotodo main");
        a();
        System.out.println("Encerrou o programa metodo main");
    }
    static void a(){
        System.out.println("Entrou no metodo a");
        b();
        System.out.println("Saiu do metodo a");
    }
    static void b(){
        System.out.println("Entrou no metodo b");
        for(int i = 0; i <= 4; i++) System.out.print(i);
        c();
        System.out.println("Saiu do metodo b");
    }
    static void c(){
        System.out.println("Entrou no metodo c");
        System.out.println("Saiu do metodo c");
    }
}