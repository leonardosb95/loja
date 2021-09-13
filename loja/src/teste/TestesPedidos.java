package teste;

import orcamento.Orcamento;
import pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"),4);
        String cliente = "Ana da Silva";
        LocalDateTime data=LocalDateTime.now();

        Pedido pedido = new Pedido(cliente,data,orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}