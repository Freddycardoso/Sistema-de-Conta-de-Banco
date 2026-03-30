package entidades;

public class SistemaBanco {

    private String nome;
    private double saldo;
    private int numeroConta;

    public SistemaBanco(String nome, double saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public SistemaBanco(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void deposito1(double deposito) {
        saldo += deposito;
    }

    public void saque1(double saque) {
        saldo -= saque + 5.00;

    }

    public String toString() {
        return "Numero da Conta: " + numeroConta + ", " + "Nome: " + nome + ", " + "Saldo: " + saldo;
    }

}
