
public class TestaValor {
	public static void main(String[] args) {
		//---Conta1---
		Conta conta = new Conta(1335, 2233);
		// Testando números negativos
		// conta.setAgencia(-35);
		// conta.setNumero(-335);

		System.out.println("Agencia:"+conta.getNumero());
		System.out.println("Número"+conta.getAgencia());
		//---Conta2---
		Conta conta2 = new Conta(1335,2234);
		System.out.println("Agencia:"+conta2.getNumero());
		System.out.println("Número"+conta2.getAgencia());
		//---Conta3---
		Conta conta3 = new Conta(1335,2235);
		System.out.println("Agencia:"+conta3.getNumero());
		System.out.println("Número"+conta3.getAgencia());
		
		System.out.println("Número de conta criadas:"+Conta.getTotal());
	}
}
