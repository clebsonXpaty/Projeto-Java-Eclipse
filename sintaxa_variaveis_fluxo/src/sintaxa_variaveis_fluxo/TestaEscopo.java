package sintaxa_variaveis_fluxo;

public class TestaEscopo {
	
	public static void main(String[] args) {
		int idade = 16;
		int idadeDoAcompanhante = 17;
	    boolean acompanhado;

		if (idade >= 18 ) {
			 acompanhado = true;
			System.out.println("Vocẽ pode entrar! " + " Seja bem vindo!");

		} else {
			 acompanhado = false;
			System.out.println("Infelismente vocã não pode entrar!");
		}
	
		// --------Exercícios---------//
	 boolean foiPromovido = true;

     if(foiPromovido) {
         double salario = 4200.0;
         System.out.println(salario);
     } else {
         double salario = 3800.0;
         System.out.println(salario);
     }

     //System.out.println(salario);
	}
}
