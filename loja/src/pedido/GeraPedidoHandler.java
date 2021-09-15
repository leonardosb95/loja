package pedido;

import orcamento.Orcamento;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Construtor com injecao de dependencias

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeIntens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar= new SalvarPedidoNoBancoDeDados();

        email.executar(pedido);
        salvar.executar(pedido);
    }
}