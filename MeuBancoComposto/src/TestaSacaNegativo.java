
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		
		//Proibido dar um saldo negativo na conta;
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
		conta.saca(101);
		System.out.println(conta.pegaSaldo());
				
	}

}
