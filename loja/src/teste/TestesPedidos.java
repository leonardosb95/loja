package teste;

import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;
import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "Leonardo";
        BigDecimal valorOrcamento = new BigDecimal("300.0");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()) );

        handler.execute(gerador);
    }
}