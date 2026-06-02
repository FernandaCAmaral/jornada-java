package br.com.alura.appcompras.modelos;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero!");
        }
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }

    @Override
    public String toString() {
        return "Compra: " + descricao + " (R$ " + valor + ")";
    }
}
