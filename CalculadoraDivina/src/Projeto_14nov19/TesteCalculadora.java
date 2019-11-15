package Projeto_14nov19;

public class TesteCalculadora {

	
	
	public static void main(String[] args) {
		
		System.out.println(new App().calcular(new Adicao(10,2)));
		System.out.println(new App().calcular(new Subtrair(10,2)));
		System.out.println(new App().calcular(new Divisao(10,2)));
		System.out.println(new App().calcular(new Multiplicar(10,2)));
		System.out.println(new App().calcular(new Raiz(10)));
		
		
	}
	
}
