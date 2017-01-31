package br.teste.methodAndConstructorReference;

interface PersonFactory<P extends Person> {
	
	P create(String firstName, String lastName);
	
}