public class Logger {
    private static Logger instancia;
    private static final String ARQUIVO_LOG = "log.txt";

    private Logger() {}

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void escreverLog(String mensagem) {
        System.out.println("Log: " + mensagem);
    }

    public static void main(String[] args) {
        Logger log1 = Logger.getInstancia();
        Logger log2 = Logger.getInstancia();

        log1.escreverLog("Sistema iniciado.");
        log2.escreverLog("Usuário fez login.");

        // Testando se ambas as instâncias são a mesma
        System.out.println(log1 == log2); // Deve imprimir 'true'
    }
}
