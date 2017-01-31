package br.teste.methodAndConstructorReference;

public class PrincipalMethodAndConstructorReference {

	public static void main(String[] args) {
		//METODO
		Something something = new Something();
		
		Converter<String, String> converter = something::startsWith;
		String converted = converter.convert("Java");
		
		Converter<String, Integer> converterQuantidade = something::quantidadeCaracteres;
		Integer convertedQuantidade = converterQuantidade.convert("Java");
		
		System.out.println(converted);    // "J"
		System.out.println(convertedQuantidade);    // 4
		
		//CONSTRUTOR
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
		
		System.out.println(person);
		
	}
}
