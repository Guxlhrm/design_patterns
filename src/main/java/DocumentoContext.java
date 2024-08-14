public class DocumentoContext {
    private DocumentoStrategy strategy;

    public void setStrategy(DocumentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void gerar(String conteudo) {
        strategy.gerarDocumento(conteudo);
    }
}
