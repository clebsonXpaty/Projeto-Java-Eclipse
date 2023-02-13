package sintaxa_variaveis_fluxo;

public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 1;linha <= 10; linha++) {
			//System.out.println("Matris triângular: "+ linha );
			for(int coluna = 1; coluna <= linha; coluna++) {
				//mudando a forma de interromper o lup dentro do (for)
				// coluna == linha
				//if(linha==coluna) {
					//break;
				
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
