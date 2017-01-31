package br.teste.defaultmethod;

public class FormulaBean implements Formula {

	@Override
	public double calculate(int a) {
		return 10 * a;
	}

	@Override
	public double sqrt(int a){
		return 5;
	}
	
}
