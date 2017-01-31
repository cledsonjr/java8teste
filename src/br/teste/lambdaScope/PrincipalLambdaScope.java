package br.teste.lambdaScope;

public class PrincipalLambdaScope {

	public static void main(String[] args) {
		PrincipalLambdaScope.withFinal();
		PrincipalLambdaScope.withoutFinal();
	}

	public static void withFinal() {
		final int num = 1;
		Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		String testeFinal = stringConverter.convert(2); // 3
		System.out.println(testeFinal);
	}

	public static void withoutFinal() {
		int num = 1;
		Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		String withoutFinal = stringConverter.convert(2); // 3
		System.out.println(withoutFinal);
//		num = 5; // SE MUDAR O VALOR DE NUM APÓS NÃO FUNCIONA, POIS PRECISA SER FINAL OU TRABALHAR COMO TAL
	}

}
