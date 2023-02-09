package sintaxa_variaveis_fluxo;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario = 1250.0;
		System.out.println("meu salário é: " + salario);
		
		double idade = 37;
		
		double divisao = 3.14 / 2;
		System.out.println("resulatado da divisão: " + divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		// inteiro não retorna número flutuante.
		
		double outraTentativa = 5 / 2;
		System.out.println(outraTentativa);
		//Mesmo sendo "double" é necessário usar o "." 
		//para o java entender o número como flutuante e não inteiro.
		
		double outraTentativa1 = 5.0 / 2;
		System.out.println(outraTentativa1);
		//utilizando o ".0" o java passoua entender o número como flutuante.
	
		
	}

}
