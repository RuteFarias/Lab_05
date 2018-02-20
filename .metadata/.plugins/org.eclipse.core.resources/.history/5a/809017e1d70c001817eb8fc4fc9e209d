package lab05;

import java.util.ArrayList;

public class Cenario {

	// atributos
	
	private int identificacao;
	private String descricao;
	private String estado;
	
	private ArrayList<Aposta> apostas;
	
	private static final String ocorreu = "Finalizado (ocorreu)";
	private static final String nOcorreu = "Nao finalizado (n ocorreu)";

	
	
	// Construtor

	public Cenario(String descricao) throws Exception{
		
		if(descricao.trim().equals("")) {
			throw new IllegalArgumentException("Erro no cadastro de cenario: Descricao nao pode ser vazia");
		}
				
		
		this.identificacao = 1;
		this.descricao = descricao;
		this.estado = "Nao finalizado";
		this.apostas = new ArrayList<>();

	}

	@Override
	public String toString() { 
		
		return identificacao + " - " + descricao + " - " + estado;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	
	public void fecharAposta(boolean aconteceu) {
		if(aconteceu == true) {
			this.estado = ocorreu;
		}
		this.estado = nOcorreu;
	}

	public int getIdentificacao() {
		return identificacao;
	}
	
	public void cadastrarAposta(String apostador, int valor, String previsao) {		
		
		Aposta aposta = new Aposta(apostador, valor, previsao);
		this.apostas.add(aposta);
	}
	public int valorTotalDeApostas(int cenario) {
		int totalApostas = 0;
		for (Aposta apostaAtual : apostas) {
			totalApostas += apostaAtual.getValorAposta();
		}
	return totalApostas;
	
	}
		
	public String exibeApostas(int cenario) {
		String retornaApostas = "";
		for (Aposta aposta : apostas) {
			retornaApostas += "/n" + aposta.toString();	
		}
		return retornaApostas;
	}
		
	public int totalDeApostas(int cenario) {
		return this.apostas.size();
		
				
	}
	public int valorApostasPerdedoras() {
		int valor = 0;
		for (Aposta aposta : apostas) {
			if(aposta.getPrevisao() == "VAI ACONTECER" && this.estado == nOcorreu) {
				valor += aposta.getValorAposta();
			}
			else if(aposta.getPrevisao() == "N VAI ACONTECER" && this.estado == ocorreu) {
				valor += aposta.getValorAposta();
			}
			
		}
		return valor;
	}
	
	
	
		
	}

	
