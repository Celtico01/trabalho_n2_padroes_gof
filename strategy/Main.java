public class StrategyExample {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.setEstrategiaPagamento(new PagamentoCartao());
        processador.processarPagamento(100.0);

        processador.setEstrategiaPagamento(new PagamentoPayPal());
        processador.processarPagamento(50.0);

        processador.setEstrategiaPagamento(new PagamentoPix());
        processador.processarPagamento(25.0);
    }
}
