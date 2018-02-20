package lab05;

public class CenarioBonus extends Cenario {
	
	private int bonus;

	public CenarioBonus(String descricao, int bonus) throws Exception {
		super(descricao);
		this.bonus = bonus;
	}


	@Override
	public String toString() { 
		
		return super.getIdentificacao() + " - " + super.getDescricao() + " - " + super.getEstado() + this.bonus;
	}
	
	public int getBonus() {
		return this.bonus;
	}
	
	
}
	
	
	
