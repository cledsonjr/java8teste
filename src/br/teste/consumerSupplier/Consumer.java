package br.teste.consumerSupplier;

@FunctionalInterface
public interface Consumer<T> {
	
	void accept(T t);
	
}