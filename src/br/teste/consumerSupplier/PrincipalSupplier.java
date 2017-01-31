package br.teste.consumerSupplier;

import java.util.ArrayList;
import java.util.List;

public class PrincipalSupplier {

	public static void main(String[] args) {

		List names = new ArrayList();
		names.add("David");
		names.add("Sam");
		names.add("Ben");

		names.stream().forEach((x) -> {
			printNames(() -> x);
		});

	}

	static void printNames(Supplier arg) {
		System.out.println(arg.get());
	}
}