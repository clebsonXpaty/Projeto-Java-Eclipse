
public class TestaMetodo {
	public static void main(String[] args) {

		Conta contaDoClebson = new Conta();
		contaDoClebson.saldo = 100;
		System.out.println(contaDoClebson.saldo);
		contaDoClebson.deposita(50);
		System.out.println(contaDoClebson.saldo);
		// uso de método, cada método precisa de um parametro para passar valores
		contaDoClebson.saca(30);
		System.out.println(contaDoClebson.saldo);
		// Testando se o valor foi retido da conta ou não
		boolean confereSaldo = contaDoClebson.saca(200);
		System.out.println(confereSaldo);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		contaDaMarcela.transfere(300, contaDoClebson);
		System.out.println("Saldo da conta da Mercela: " + contaDaMarcela.saldo);
		System.out.println("Saldo da conta do Clebson: " + contaDoClebson.saldo);

		boolean sucessoTransferencia;
		if (sucessoTransferencia = contaDaMarcela.transfere(300, contaDoClebson)) {
			System.out.println("Transferência ralizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente, não foi possível realizar " + "essa operação!");
		}
	}
}
