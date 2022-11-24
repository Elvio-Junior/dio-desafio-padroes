package br.com.padrao.chain.model;

import java.util.List;

public class Pedido {
    int numero;
    double valorTotal;
    double valorDoDesconto;
    List<Item> itens;
    public Pedido(int numero, double valorTotal, double valorDoDesconto, List<Item> itens) {
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.valorDoDesconto = valorDoDesconto;
        this.itens = itens;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double getValorDoDesconto() {
        return valorDoDesconto;
    }
    public void setValorDoDesconto(double valorDoDesconto) {
        this.valorDoDesconto = valorDoDesconto;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    @Override
    public String toString() {
        return "Pedido [numero=" + numero + ", valorTotal=" + valorTotal + ", valorDoDesconto=" + valorDoDesconto
                + ", itens=" + itens + "]";
    }

    
}
