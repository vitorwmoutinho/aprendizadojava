public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano){
            case "T":{
                System.out.println("5GB Youtube");
                break;
            }
            case "M":{
                System.out.println("2GB Youtube");
                break;

            }
            case "B":{
                System.out.println("100 minutos ligação");
                break;
            }
            default:
                System.out.println("Plano Full");
        }
    }
}
