package br.com.padrao.chain.service;

import br.com.padrao.chain.model.Pedido;

public class DescontoPorValorPedido implements Desconto {
    private Desconto proximo;

    @Override
    public double calcular(Pedido pedido) {
        double valorDesconto = 0d;

        if (pedido.getValorTotal() > 1000.0) valorDesconto = pedido.getValorTotal() * 0.03;

        return  valorDesconto;
        
    }

    @Override
    public void setProximo(Desconto proximo) {
        // TODO Auto-generated method stub
        this.proximo = proximo;
        
    }
}
