package Projeto_14nov19;

public class Raiz implements Operacao {

	private double numero;
	
	public Raiz(double numeroUm) {
		this.numero = numeroUm;
	}
	
	@Override
	public double calcula() {
		
		return Math.sqrt(this.numero);
	}
}
