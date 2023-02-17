
public class ExerciciosMetodoInstancia {
	public static void main(String[] args) {
		Pessoa carlos = new Pessoa();
		carlos.endereco = new Endereco();
		carlos.endereco.logradouro = "Travessa Luis Palmares";
		System.out.println(carlos.endereco.logradouro);
	}

}
