package Projeto_14nov19;

public class Adicao implements Operacao {

	private double numeroUm,numeroDois;
	
	public Adicao(double numeroUm, double numeroDois) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
	}
	
	
	@Override
	public double calcula() {
		
		return this.numeroUm + this.numeroDois;
	}

	 
	
	
}
