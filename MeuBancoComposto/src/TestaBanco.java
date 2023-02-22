public class TestaBanco {
	public static void main(String[] args) {
		Cliente clebson = new Cliente();
		clebson.nome = "Clebson Alves";
		clebson.cpf = "222.222.222.-22";
		clebson.profissao = "programador";

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

		contaDoPaulo.titular = clebson;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);

	}
}