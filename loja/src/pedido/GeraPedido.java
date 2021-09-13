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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getQuantidadeIntens() {
        return quantidadeIntens;
    }

    public void setQuantidadeIntens(int quantidadeIntens) {
        this.quantidadeIntens = quantidadeIntens;
    }
}