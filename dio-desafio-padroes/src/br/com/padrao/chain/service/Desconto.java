package br.com.padrao.chain.service;

import br.com.padrao.chain.model.Pedido;

public interface Desconto {
    
    double calcular(Pedido pedido);

    void setProximo(Desconto proximo);
}
