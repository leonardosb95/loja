package pedido.acao;

import pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados!");
    }
}