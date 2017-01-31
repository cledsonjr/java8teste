package br.teste.consumerSupplier;

@FunctionalInterface
public interface Supplier<T> {
	
	T get();
	
}