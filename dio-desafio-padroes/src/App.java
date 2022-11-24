import java.util.ArrayList;
import java.util.List;

import br.com.padrao.chain.model.Item;
import br.com.padrao.chain.model.Pedido;
import br.com.padrao.chain.service.CalcularDesconto;

public class App {
    public static void main(String[] args) throws Exception {
        Item item1 = new Item("Refrigerador", 2000.0, 1);
        List<Item> itensPedido1 = new ArrayList<>(){{
            add(item1);
        }};
        Pedido pedido1 = new Pedido(1, 2000.0, 0, itensPedido1);
        System.out.println(pedido1);
        CalcularDesconto calcularDesconto = new CalcularDesconto();
        double desconto = calcularDesconto.calcular(pedido1);
        pedido1.setValorDoDesconto(desconto);
        System.out.println(pedido1);

        Item item2 = new Item("Tablet", 100.0, 1);
        Item item3 = new Item("Celular", 500.0, 1);
        Item item4 = new Item("Notebook", 600.0, 1);
        Item item5 = new Item("Mouse", 50.0, 1);

        List<Item> itensPedido2 = new ArrayList<>(){{
            add(item2);
            add(item3);
            add(item4);
            add(item5);
        }};

        Pedido pedido2 = new Pedido(2, 1250.0, 0, itensPedido2);
        System.out.println(pedido2);
        desconto = calcularDesconto.calcular(pedido2);
        pedido2.setValorDoDesconto(desconto);
        System.out.println(pedido2);

        List<Item> itensPedido3 = new ArrayList<>(){{
            add(item2);
            add(item3);
        }};

        Pedido pedido3 = new Pedido(3, 600.0, 0, itensPedido3);
        System.out.println(pedido3);
        desconto = calcularDesconto.calcular(pedido3);
        pedido2.setValorDoDesconto(desconto);
        System.out.println(pedido3);

    }
}
