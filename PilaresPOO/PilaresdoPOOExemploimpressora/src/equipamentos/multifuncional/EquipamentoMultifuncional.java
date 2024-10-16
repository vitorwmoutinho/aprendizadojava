package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	
	public void Copiar() {
		// TODO Auto-generated method stub
		System.out.println("Copiando Multifuncional");
		
	}
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("Digitalizando Multifuncional");
		
	}
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo Multifuncional");
		
	}

}
