package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    //atributos
    private String nome;
    private long cod;
    private double valor;
    private int qtd;

    public Produto(long cod, String nome, double valor, int qtd) {
        this.nome = nome;
        this.cod = cod;
        this.valor = valor;
        this.qtd = qtd;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", valor=" + valor + ", qtd=" + qtd + "]";
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getValor(), p2.getValor());
    }
}
