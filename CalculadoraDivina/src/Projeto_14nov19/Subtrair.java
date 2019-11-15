package Projeto_14nov19;

public class Subtrair implements Operacao {
   
    private double numeroUm,numeroDois;
	
	public Subtrair(double numeroUm, double numeroDois) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
	}
	
	
	@Override
	public double calcula() {
		
		return this.numeroUm - this.numeroDois;
	}

	
}
