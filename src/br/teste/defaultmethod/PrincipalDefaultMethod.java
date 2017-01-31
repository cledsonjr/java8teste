package br.teste.defaultmethod;

public class PrincipalDefaultMethod {

	 public static void main(String[] args) {
		 
		Formula formula = new FormulaBean();
		
		System.out.println(formula.calculate(10));
		
		System.out.println(formula.sqrt("9"));
		
		System.out.println(formula.teste(9));
		
	}
}
