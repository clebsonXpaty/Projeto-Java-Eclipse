package sintaxa_variaveis_fluxo;

public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1250.50;
		int valor = (int) salario;
		System.out.println(valor);
		//Usamos o casting para tribuírmos valor de outro tipo a variável existente!
		
		long valor1 = 474673683638363839l;
		// Usarmos o tipo "long" quando queremos trabalhar com números muuito extensos;
		
		byte b = 124;
		// O tipo "byte" é mais utilizado em operações binárias;
		
		float varia = 127.5f;
		// O uso de float é uma alternativa ao double 
		
		double valor2 = 0.1;
		double valor3 = 0.2;
		double resultado = valor2 + valor3;
		
		System.out.println("Resultado: " + resultado);
		// Existem alguns problemas na utilização do "double", um deles está relacionado 
		// ao trabalho com soma de sálarios .
		
		
	}

}
