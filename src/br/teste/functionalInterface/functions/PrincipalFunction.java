package br.teste.functionalInterface.functions;

import java.util.function.Function;

public class PrincipalFunction {

	// Functions accept one argument and produce a result. Default methods can
	// be used to chain multiple functions together (compose, andThen).
	public static void main(String[] args) {
		int somarUm = 1;
		
		Function<Integer, Integer> adicionarUm = (x) -> x + somarUm;
		
		Function<Integer, Integer> multiplicarPorDez = (x) -> x * 10;
		
		Function<String, Integer> toInteger =Integer::valueOf;
		
		Function<String, String> backToString = toInteger
													.andThen(adicionarUm)
													.andThen(multiplicarPorDez)
													.andThen(String::valueOf);

		String teste = backToString.apply("123");   
		// "123"
		System.out.println(teste);
	}
}
