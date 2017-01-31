package br.teste.lambdaScope;

public interface Formula {

	double calculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	
	default double sqrt(String a){
		return Math.sqrt(new Integer(a));
	}
	
	default double teste(int a){
		return colocarComoNegativo(Math.sqrt(a));
	}
	
	default double colocarComoNegativo(double x){
		return x * -1;
	}
}
