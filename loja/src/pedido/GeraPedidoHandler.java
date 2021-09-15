package pedido;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeIntens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);
        acoes.forEach(a -> a.executar(pedido));
    }
}