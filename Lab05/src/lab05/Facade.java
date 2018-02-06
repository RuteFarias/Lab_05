package lab05;

import easyaccept.EasyAccept;

public class Facade {
	
	public static void main(String[] args) {
		args = new String[] {"lab05.Facade", "lab05_test/us1_test.txt", "lab05_test/us2_test.txt", "lab05_test/us3_test.txt", "lab05_test/us4_test.txt"};
		EasyAccept.main(args);
			    }
	
	// Atributos

	private Sistema sistema;
	
	// Construtor
	
	public Facade() {
		this.sistema = new Sistema();
	}
	
	
	

}
