// Interface Strategy
interface PagamentoStrategy {
    void pagar(double valor);
}

// Implementação para pagamento com Cartão
class PagamentoCartao implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão.");
    }
}

// Implementação para pagamento com PayPal
class PagamentoPayPal implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}

// Implementação para pagamento com Pix
class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Pix.");
    }
}

// Classe responsável por processar o pagamento
class ProcessadorPagamento {
    private PagamentoStrategy estrategiaPagamento;

    public void setEstrategiaPagamento(PagamentoStrategy estrategia) {
        this.estrategiaPagamento = estrategia;
    }

    public void processarPagamento(double valor) {
        if (estrategiaPagamento == null) {
            System.out.println("Nenhuma estratégia de pagamento selecionada.");
            return;
        }
        estrategiaPagamento.pagar(valor);
    }
}
