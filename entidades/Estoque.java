package entidades;

public class Estoque {
    private String nome;
    private double preco;
    private int quantidade;

    public Estoque(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Estoque(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public Estoque() {
    }

    public void setName(String name) {
        this.nome = name;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getName() {
        return nome;

    }

    public double getPreco() {
        return preco;

    }

    public double totalValueInStock() {
        return preco * quantidade;
    }

    public void addProducts(int quantity) {
        this.quantidade += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantidade -= quantity;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
