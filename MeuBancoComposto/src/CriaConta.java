public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.pegaSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.pegaSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(50);

        System.out.println("primeira conta tem " + primeiraConta.pegaSaldo());
        System.out.println("segunda conta tem " + segundaConta.pegaSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }

}