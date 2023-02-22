
class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total=0;
	
	//---Construtores---
	public Conta(int numero, int agencia) {
		Conta.total++;
	System.out.println("Estou criando uma conta!"+
		"Conta:"+Conta.total);	
	this.numero = numero;
	this.agencia = agencia;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	//---saldo---
	public double getSaldo() {
		return this.saldo;
	}
	// os getters e setters numero e agencia deixa de existir em
	//alguns casos quando utilizamos os construtores
	
	//---numero---
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero<=0) {
			System.out.println("Esse número de conta não é válido!");
			return;
		}
		this.numero = numero;
	}
	//---Agencia---
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(numero<=0) {
			System.out.println("Esse número de Agência não é válido!");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return total;
	}
}