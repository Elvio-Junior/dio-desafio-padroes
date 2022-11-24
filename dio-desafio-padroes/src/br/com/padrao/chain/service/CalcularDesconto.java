package br.com.padrao.chain.service;

import br.com.padrao.chain.model.Pedido;

public class CalcularDesconto {
 
    public double calcular(Pedido pedido) {
        final Desconto descontoPorItem = new DescontoPorItem();
        final Desconto descontoPorValor = new DescontoPorValorPedido();
        descontoPorValor.setProximo(descontoPorItem);
    
        return descontoPorValor.calcular(pedido);
    } 
}
