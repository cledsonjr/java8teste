package br.teste.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

//https://sanaulla.info/2013/09/02/deep-dive-into-optional-class-api-in-java-8/
	
public class PrincipalOptional {

	private static String nome = "Cledson";
			
	public static void main(String[] args) {
//		PrincipalOptional.of();// Exception
		PrincipalOptional.ofNullable();
		PrincipalOptional.get();
		PrincipalOptional.isPresent();
		PrincipalOptional.ifPresent();
		PrincipalOptional.orElse();
		PrincipalOptional.orElseGet();
		PrincipalOptional.orElseThrow();
		PrincipalOptional.map();
	}

	// TODO of
	public static void of() {
		// Cria uma instância do Optional usando um Factory Method
		Optional<String> name = Optional.of(nome);
		System.out.println(name.get());

		// Ocorre uma Exception ao receber NULL
		Optional<String> someNull = Optional.of(null);
		System.out.println(name.get());
	}

	// TODO ofNullable
	public static void ofNullable() {
		// This represents an instance of Optional containing no value
		// i.e the value is 'null'
		Optional empty = Optional.ofNullable(null);

		Optional<String> name = Optional.ofNullable(nome);
		System.out.println(name.get());
	}

	// TODO isPresente
	public static void isPresent() {
		Optional<String> name = Optional.of(nome);
		// isPresent method is used to check if there is any
		// value embedded within the Optional instance.
		if (name.isPresent()) {
			// Invoking get method returns the value present
			// within the Optaional instance.
			System.out.println(name.get());// prints Sanaulla
		}
	}
	
	// TODO get
	public static void get() {
		Optional<String> name = Optional.ofNullable(nome);
		Optional<String> vazio = Optional.ofNullable(null);
		
		//The below code prints: No value present 
		try {
			
			System.out.println(name.get());
			
		  //Invoking get method on an empty Optaional instance 
		  //throws NoSuchElementException.
		  System.out.println(vazio.get());
		} catch (NoSuchElementException ex) {
		  System.out.println(ex.getMessage());
		}
	}

	// TODO ifPresent
	public static void ifPresent() {
		Optional<String> name = Optional.ofNullable(nome);
		//ifPresent method takes a lambda expression as a parameter.
		//The lambda expression can then consume the value if it is present
		//and perform some operation with it.
		name.ifPresent((value) ->  System.out.println("The length of the value is: " + value.length()));
	}
	
	// TODO orElse
	public static void orElse() {
		Optional<String> name = Optional.ofNullable(nome);
		Optional<String> vazio = Optional.ofNullable(null);
		//orElse method either returns the value present in the Optional instance
		//or returns the message passed to the method in case the value is null.
		//prints: There is no value present!
		System.out.println(vazio.orElse("There is no value present!"));
		//prints: Sanaulla
		System.out.println(name.orElse("There is some value!"));
	}
	
	// TODO orElseGet
	public static void orElseGet() {
		Optional<String> name = Optional.ofNullable(nome);
		Optional<String> vazio = Optional.ofNullable(null);
		//orElseGet is similar to orElse with a difference that instead of passing 
		//a default value, we pass in a lambda expression which generates the default 
		//value for us.
		//prints: Default Value
		System.out.println(vazio.orElseGet(() -> "Default Value"));
		//prints: Sanaulla
		System.out.println(name.orElseGet(() -> "Default Value"));
	}
	
	
	// TODO orElseThrow
	public static void orElseThrow() {
		Optional<String> name = Optional.ofNullable(nome);
		Optional<String> vazio = Optional.ofNullable(null);
		try {
			  //orElseThrow similar to orElse method, instead of returning a default
			  //value, this method throws an exception which is generated from 
			  //the lambda expression/method reference passed as a param to the method.
			vazio.orElseThrow(NullPointerException::new);
			} catch (Throwable ex) {
			  //prints: No value present in the Optional instance
			  System.out.println(ex.getMessage());
			}
	}
	
	// TODO map
	public static void map() {
		Optional<String> name = Optional.ofNullable(nome);
		Optional<String> vazio = Optional.ofNullable(null);
		//map method modifies the value present within the Optional instance
		//by applying the lambda expression passed as a parameter. 
		//The return value of the lambda expression is then wrapped into another
		//Optional instance.
		Optional<String> upperName = name.map((value) -> value.toUpperCase());
		System.out.println(upperName.orElse("No value found"));
		
		Optional<String> upperNameVazio = vazio.map((value) -> value.toUpperCase());
		System.out.println(upperNameVazio.orElse("No value found"));
	}
	
	// TODO BLANK
	public static void blank() {

	}
}
