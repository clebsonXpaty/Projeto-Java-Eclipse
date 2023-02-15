
public class CriaConta {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		//System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Primeira Conta tem: " + primeiraConta.saldo);
		
		// Criando uma segund aconta 
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Segunda Conta tem: "+ segundaConta.saldo);
		
		// inicialização das variáveis com default, normalmente com (0)
		// para os tipos double, int, float 
		System.out.println(" numero da agencia inicializada com default= "+segundaConta.agencia);
		System.out.println("Tipo String inicializado com NULL por padrão: "+segundaConta.titular);
		
		// Exercícios
		segundaConta.titular = "João Paulo";
		System.out.println("Nome do titular da conta: " +segundaConta.titular);
		
		// Comparando referencia com instancia
		System.out.println("Primeira conta: " +primeiraConta);
    	System.out.println("Segunda conta: " +segundaConta);
    	
    	if (primeiraConta == segundaConta) {
    		System.out.println();
    	}else {
    		System.out.println("Não são as mesmas contas!");
    	}
		
		
	}

}
