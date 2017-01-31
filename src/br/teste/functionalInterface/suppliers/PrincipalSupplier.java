package br.teste.functionalInterface.suppliers;

import java.util.function.Supplier;

public class PrincipalSupplier {

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
