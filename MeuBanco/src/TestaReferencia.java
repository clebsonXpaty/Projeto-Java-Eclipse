
public class TestaReferencia {
	 public static void main(String [] args) { 
	        Conta primeiraConta = new Conta();
	        primeiraConta.saldo = 300;

	        System.out.println("saldo da primeira: " + primeiraConta.saldo);
	        // uso de referencia, foi criado uma segunda referencia para a mesma conta
	        Conta segundaConta = primeiraConta;
	        System.out.println("Saldo da segunda Conta: " +segundaConta.saldo);
	        // comparando se as referencias são para a mesma conta;
	        
	        if(segundaConta == primeiraConta) {
	        	System.out.println("São a mesma conta!");
	        	
	        	System.out.println("Primeira conta: " +primeiraConta);
	        	System.out.println("Segunda conta: " +segundaConta);
	        	// Se estivesse usando o (new) seria uma nova conta 
	        }
	 }
}
