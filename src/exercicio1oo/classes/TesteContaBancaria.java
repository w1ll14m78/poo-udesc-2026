package exercicio1oo.classes;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria william = new ContaBancaria();
        william.numeroconta = "2";
        william.titular = "william";
        william.saldo = 10.000;
        System.out.println("numero conta: " + william.numeroconta);
        System.out.println("titular: " + william.titular);
        System.out.println("saldo: " + william.saldo);
    }
}

