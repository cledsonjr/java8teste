package br.teste.functionalInterface.comparators;

import java.util.function.Supplier;

public class PrincipalComparator {

	// Suppliers produce a result of a given generic type. Unlike Functions,
	// Suppliers don't accept arguments.
	public static void main(String[] args) {
		Supplier<Person> personSupplier = Person::new;
		Person teste = personSupplier.get();   // new Person
		teste.setFirstName("Cledson");
		teste.setLastName("Alves");
		System.out.println(teste);
	}
}
