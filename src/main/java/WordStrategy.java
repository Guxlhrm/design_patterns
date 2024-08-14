public class WordStrategy implements DocumentoStrategy {

    @Override
    public void gerarDocumento(String conteudo) {
        System.out.println("Gerando documento Word com o conteúdo: " + conteudo);
    }
}
