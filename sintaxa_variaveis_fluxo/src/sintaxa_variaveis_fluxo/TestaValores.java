package sintaxa_variaveis_fluxo;

public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		System.out.println(segundo);
		// o jav guarda valores por atribuição e não por referência, por tanto se eu
		// atribuir um novo valor a variável (primeiro), o valor da variável (segundo)
		// não será alterado;
		// Ex.: ( primeiro = 10 ), um novo print irá imprimir (segundo) como 5 ;

		primeiro = 10;
		System.out.println(primeiro);
	}

}
