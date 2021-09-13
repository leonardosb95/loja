package pedido;
import orcamento.Orcamento;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeIntens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeIntens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeIntens = quantidadeIntens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento,this.quantidadeIntens);
        Pedido pedido = new Pedido(cliente,LocalDateTime.now(),orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}