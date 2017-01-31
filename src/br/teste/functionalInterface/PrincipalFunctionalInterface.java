package br.teste.functionalInterface;

public class PrincipalFunctionalInterface {

	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);    // 123
		converter.printDeAlgo();
	}
}
