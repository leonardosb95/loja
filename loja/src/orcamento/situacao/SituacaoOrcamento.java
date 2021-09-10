package orcamento.situacao;
import loja.DomainException;
import orcamento.Orcamento;
import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}