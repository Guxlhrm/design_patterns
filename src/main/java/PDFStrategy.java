public class PDFStrategy implements DocumentoStrategy {

    @Override
    public void gerarDocumento(String conteudo) {
        System.out.println("Gerando documento PDF com o conteúdo: " + conteudo);
    }
}
