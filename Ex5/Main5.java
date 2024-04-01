import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     Carro carro1 = new Carro(" - Subaru", " - Impreza", 2004, " - BCW7373");

    System.out.println("Informações sobre o Carro:");
    carro1.exibirInformacoes();

    System.out.println("Digite a velocidade para Acelerar:");
    int incremento = leitor.nextInt();
    carro1.acelerar(incremento);

    System.out.println("Digite o decremento de velocidade para frear: ");
    int decremento = leitor.nextInt();
    carro1.frear(decremento);

    System.out.println("informacões atualizadas sobre o Carro:");
    carro1.exibirInformacoes();
    }
}