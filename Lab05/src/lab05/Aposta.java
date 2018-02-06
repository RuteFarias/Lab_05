package lab05;

public class Aposta {
	
	// Atributos
	
	private String nomeApostador;
	private int valorAposta;
	private String previsao ;
	
	// Construtor
	
	public Aposta(String nomeApostador, int valorAposta, String aposta) {
		this.nomeApostador = nomeApostador;
		this.valorAposta = valorAposta;
		this.previsao = aposta;
		
		
	}
	
	
	//private String getValorAposta() {
      //  double valorAposta = this.valorAposta / 100.0;
        //return "R$" + Double.toString(valorAposta);
    //}
	
	
	public double getValorAposta() {
		double valorAposta = this.valorAposta / 100.0;
		return valorAposta;
	}

	@Override
	public String toString() {
		return nomeApostador + " - R$"  + this.getValorAposta() + " - " + previsao;
				
	}
	
		
	
	
}