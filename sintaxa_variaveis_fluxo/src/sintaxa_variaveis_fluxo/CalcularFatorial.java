package sintaxa_variaveis_fluxo;

public class CalcularFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		
		for(int numero =1; numero <= 10; numero++) {
			 fatorial = fatorial * numero;
			System.out.println("Fatorial de "+ numero +" = "+ fatorial);
		}
	}

}
