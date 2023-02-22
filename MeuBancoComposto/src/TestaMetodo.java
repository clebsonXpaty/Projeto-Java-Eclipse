public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoclebson  = new Conta();
		contaDoclebson.deposita(100);
		contaDoclebson.deposita(50);
		System.out.println(contaDoclebson.getSaldo());

		boolean conseguiuRetirar = contaDoclebson.saca(20);
		System.out.println(contaDoclebson.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoclebson);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoclebson.getSaldo());
	}

}