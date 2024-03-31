import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Biblioteca> biblioteca = new ArrayList<>();

        System.out.println("Digite o titulo do Livro: ");
        String titulo = leitor.nextLine();

        System.out.println("Digite o nome do autor: ");
        String autor = leitor.nextLine();

        System.out.println("Digite o ano da publicação: ");
        int anoPublicacao = leitor.nextInt();
        leitor.nextLine(); 

        Biblioteca bibliteca = new Biblioteca(titulo, autor, anoPublicacao);
        biblioteca.add(bibliteca);

        System.out.println("\nInformações do Livro:");
        for (Biblioteca l : biblioteca) {
            l.exibirInfo();
        }

        leitor.close();
    }
}