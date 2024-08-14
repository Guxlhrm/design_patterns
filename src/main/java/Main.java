import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DocumentoContext context = new DocumentoContext();

        System.out.println("Escolha o formato do documento (1: PDF, 2: Word): ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o conteúdo do documento: ");
        String conteudo = scanner.nextLine();

        if (escolha == 1) {
            context.setStrategy(new PDFStrategy());
        } else if (escolha == 2) {
            context.setStrategy(new WordStrategy());
        } else {
            System.out.println("Formato inválido!");
            return;
        }

        context.gerar(conteudo);
    }
}
