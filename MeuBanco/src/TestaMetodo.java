
public class TestaMetodo {
	public static void main(String[] args) {
		
	
	
	Conta contaDoClebson = new Conta();
	contaDoClebson.saldo = 100;
	System.out.println(contaDoClebson.saldo);
	contaDoClebson.deposita(50);
	System.out.println(contaDoClebson.saldo);
	}
}
