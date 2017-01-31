package br.teste.consumerSupplier;

import java.util.function.Consumer;

public class PrincipalConsumer {

	public static void main(String[] args) {

		Consumer<String> consumer = PrincipalConsumer::printNames;

		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");

	}

	private static void printNames(String name) {
		System.out.println(name);
	}
}