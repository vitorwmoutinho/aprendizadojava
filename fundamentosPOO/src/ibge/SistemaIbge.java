package ibge;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla()+ " - " + e.getNome()+ "-" + e.getIbge());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
		System.out.println(eb.getNomeMaiusculo());
	}

}