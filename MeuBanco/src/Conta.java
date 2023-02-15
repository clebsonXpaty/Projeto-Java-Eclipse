class Conta{
	double saldo;
	int numero;
	int agencia;
	String titular;
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}