package ibge;

public enum EstadoBrasileiro {
    
	SAO_PAULO("SP", "São paulo", "11"),
	RIO_JANEIRO("RJ", "Rio de Janeiro", "12"),
	PIAUI("PI", "Piaui", "14"),
	PARA("PA", "Para", "15");
	
	private String nome;
	private String sigla;
	private String ibge;
	
	private EstadoBrasileiro(String sigla, String nome, String ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
		}
	
	public String getIbge() {
		return ibge;
	}

	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}
