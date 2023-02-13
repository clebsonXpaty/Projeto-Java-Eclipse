package sintaxa_variaveis_fluxo;

public class TestaCondicinal {
	public static void main(String[] args) {
		System.out.println();
		
		int idade = 16;
		int idadeDoAcompanhante = 17;
		
		if (idade >= 18) {
			System.out.println("Vocẽ pode entrar! "
					+ " Seja bem vindo!");
			
		}else {
			if(idadeDoAcompanhante >=18) {
			System.out.println("Com acompanhante maior de idade "
					+ "voẽ está altorizado, "
					+ "seja bienvindo !");
		} 
			 else {
					System.out.println("Infelismente vocã não pode entrar!");
				}
		}
	

}
}
