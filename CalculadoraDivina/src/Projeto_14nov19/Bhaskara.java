package Projeto_14nov19;

public class Bhaskara implements Operacao {

	private double a,b,c;
	
	
	public Bhaskara( double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	@Override
	public double calcula() {
		
		App c = new App();
		
		 double bQuadrado, avezesc, delta, x1 , x2, raizDelta, batata, doisA, cebola;
		 
		 bQuadrado = c.calcular(new Multiplicar(this.b,this.b));
		 avezesc = c.calcular(new Multiplicar (this.a, this.c));
		 delta = c.calcular(new Subtrair (bQuadrado, avezesc));
		 
		 raizDelta = c.calcular(new Raiz (delta));
		 
		 batata = c.calcular(new Adicao (-b, raizDelta));
		 cebola = c.calcular(new Subtrair (-b, raizDelta));
		 doisA = c.calcular(new Multiplicar (2, a));
		 
		 x1 = c.calcular(new Divisao (batata, doisA));
		 x2 = c.calcular(new Divisao (cebola, doisA));~
		 
		 
		 
				 
		 
		 
		 
		 
		 
		
		
		
		
		
	}
   
	
	
}
