package construtores;

import java.util.Locale;
import java.util.Scanner;
import entidades.Estoque;

public class EstoqueMercado {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();

        System.out.print("Price: ");
        double preco = sc.nextDouble();

        Estoque estoque = new Estoque(nome, preco);
        estoque.setName("Computer");
        estoque.setPreco(1200.00);
        System.out.println("Uptade data: " + estoque.getName() + estoque.getPreco());

        System.out.println();
        System.out.println("Product data: " + estoque);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");

        int quantidade = sc.nextInt();
        estoque.addProducts(quantidade);

        System.out.println();
        System.out.println("Updated data: " + estoque);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantidade = sc.nextInt();
        estoque.removeProducts(quantidade);

        System.out.println();
        System.out.println("Updated data: " + estoque);
        sc.close();
    }
}
