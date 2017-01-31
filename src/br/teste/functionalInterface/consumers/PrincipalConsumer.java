package br.teste.functionalInterface.consumers;

import java.util.Comparator;

public class PrincipalConsumer {

//	Comparators are well known from older versions of Java. Java 8 adds various default methods to the interface.
	public static void main(String[] args) {
		Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");

		int c1 = comparator.compare(p1, p2);             // > 0
		System.out.println(c1);
		int c2 = comparator.reversed().compare(p1, p2);  // < 0
		System.out.println(c2);
	}
}
