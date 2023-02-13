package sintaxa_variaveis_fluxo;

public class TestaCaracteres {
 public static void main(String[] args) {
	 
	 char caracter = 'a';
	 // O tipo "char" suporta apenas um caracter ou um número refente 
	 // a sua tabela de binários, ex.: "66" que representa a letra 'a' na tabela;
	 
	 System.out.println(caracter);
	 
	 char caracter1 = 66;
	 System.out.println(caracter1);
	 
	 char caracter2 = (char) (caracter1 +1);
	 System.out.println(caracter2);
	 // Para somarmos um tipo (char) a um tipo (inteiro) é necessário fazer a conversão
	 
	 String frase = "minha formação na Alura";
	 System.out.println(frase);
	 // O String não é um tipo específico a linguagem java mas é muito utilizado 
	 
	 frase = frase + 20;
	 System.out.println(frase);
	 // É possível soma uma String com um número( concatenar),
	 // para fins de apresentação na tela;
 }
}
