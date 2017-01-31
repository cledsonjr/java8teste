package br.teste.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalLambda {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		
		ordenarVersoesAntigas(names);
		print(names);
		ordenarJava8(names);
		print(names);
		
		
	}
	
	static List<String> ordenarVersoesAntigas(List<String> names){
		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return b.compareTo(a);
		    }
		});
		return names;
	}
	
	static List<String> ordenarJava8(List<String> names){
//		Collections.sort(names, (String a, String b) -> {
//		    return b.compareTo(a);
//		});
//		
//		Collections.sort(names, (String a, String b) -> b.compareTo(a));

		Collections.sort(names, (a, b) -> a.compareTo(b));
		
		return names;
	}
	
	
	static void print(List<String> names){
		names.stream().forEach(System.out::println);
	}
}
