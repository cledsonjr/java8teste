package br.teste.lambdaScope;

@FunctionalInterface
interface Converter<F, T> {
	
	T convert(F from);
	
	default void printDeAlgo(){
		System.out.println("Realmente é algo!");
	}
}