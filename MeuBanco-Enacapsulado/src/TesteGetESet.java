class TesteGetESet {
public static void main(String[] args) {
	Conta conta = new Conta(1335,2233);
	//conta.setNumero(1322);
	//conta.setAgencia(1234);
	System.out.println(conta.getNumero());
	System.out.println(conta.getAgencia());
	
	Cliente clebson = new Cliente();
	conta.setTitular(clebson);
	clebson.setNome("Clebson Alves"); 
	System.out.println(clebson.getNome());
	System.out.println();
}
}
          