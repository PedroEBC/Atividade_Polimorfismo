package atividade;

public class ContaCorrente extends InstrumentoFinanceiro {
	
	private float limite;

	
	public ContaCorrente(float limite) {
		super();
		this.limite = limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public float calcularSaldoTotal()
	{
		return getSaldo() + limite;
	}
	
	
	
	
	
	
}
