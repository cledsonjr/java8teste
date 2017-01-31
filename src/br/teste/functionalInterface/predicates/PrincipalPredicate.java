package br.teste.functionalInterface.predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class PrincipalPredicate {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println("Maior que 0 :" + predicate.test("foo"));
		System.out.println("Maior que 0, negado: " + predicate.negate().test("foo"));
		
		Predicate<String> nonNull = Objects::nonNull;
		Predicate<String> isNull = Objects::isNull;
		System.out.println("N�o � nulo:" + nonNull.test("foo"));
		System.out.println("� nulo:" + isNull.test("foo"));
		
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		System.out.println("� vazio:" + isEmpty.test("foo"));
		System.out.println("� vazio, negado:" + isNotEmpty.negate().test("foo"));
		
	}
}
