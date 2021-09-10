package imposto;

import desconto.Desconto;
import desconto.DescontoParaOrcamentoComMaisDeCincoItens;
import desconto.DescontoParaOrcamentoComValorMaiorQueQuinhentos;
import desconto.SemDesconto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
               new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                    new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}