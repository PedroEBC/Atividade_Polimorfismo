package atividade;

public class FundoDeAplicacao extends InstrumentoFinanceiro {

	private float rentabilidade;

	
	public FundoDeAplicacao(float rentabilidade) {
		super();
		this.rentabilidade = rentabilidade;
		
	}
	
	
	
	public void setRentabilidade(float rentabilidade) 
	{
		this.rentabilidade = rentabilidade;
	}
	
	public float calcularSaldoTotal()
	{
		return this.getSaldo() + (getSaldo() * this.rentabilidade/100);
	}
}
