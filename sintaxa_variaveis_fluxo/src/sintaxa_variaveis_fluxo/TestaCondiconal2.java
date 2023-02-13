package sintaxa_variaveis_fluxo;

public class TestaCondiconal2 {
	public static void main(String[] args) {
		// Usando condional (boolean) como true ou false,
		// enchugando so if's da class ( TestandoCondiconal) anterior
		
		int idade = 16;
		int idadeDoAcompanhante = 17;
		boolean acompanhado = idadeDoAcompanhante >= 18;

		if (idade >= 18 || acompanhado) {
			System.out.println("Vocẽ pode entrar! " + " Seja bem vindo!");

		} else {
			System.out.println("Infelismente vocã não pode entrar!");
		}

	}

}
