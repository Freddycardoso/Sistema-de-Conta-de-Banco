package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.SistemaBanco;

public class Banco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("================");
        System.out.println(" BANCO DE MINAS ");
        System.out.println("================");

        System.out.print("Entre com o numero da sua conta(4 digitos):");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Quer fazer um depósito inicial? (S/N) ");
        char resposta = sc.next().charAt(0);
        SistemaBanco banco;
        if (resposta == 'S' || resposta == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            banco = new SistemaBanco(nome, depositoInicial, numeroConta);

        } else {
            banco = new SistemaBanco(nome, numeroConta);
        }
        System.out.println("Dados da conta:" + banco.toString());
        System.out.println("Digite um valor para depositar: ");
        double deposito = sc.nextDouble();
        banco.deposito1(deposito);

        System.out.println("Dados da conta atualizados: ");
        System.out.println(banco.toString());

        System.out.println("Digite um valor para sacar: ");
        double saque = sc.nextDouble();
        banco.saque1(saque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(banco.toString());
        sc.close();
    }

}
