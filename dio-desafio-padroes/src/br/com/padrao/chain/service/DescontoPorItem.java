package br.com.padrao.chain.service;

import br.com.padrao.chain.model.Pedido;

public class DescontoPorItem implements Desconto{

    private Desconto proximo;

    @Override
    public double calcular(Pedido pedido) {
        double valorDesconto = 0d;

        if (pedido.getItens().size() > 3) valorDesconto = pedido.getValorTotal() * 0.02;

        return valorDesconto;
        
    }

    @Override
    public void setProximo(Desconto proximo) {
        // TODO Auto-generated method stub
        this.proximo = proximo;
        
    }
    
}
