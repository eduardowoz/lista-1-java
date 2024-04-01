import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Por favor, escolha a operação desejada: (+, -, *, /)");
        String operacao = leitor.nextLine();

        System.out.println("Por favor, digite o primeiro número:");
        double num1 = leitor.nextDouble();

        System.out.println("Por favor, digite o segundo número:");
        double num2 = leitor.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = Calculadora.adicionar(num1, num2);
                break;
            case "-":
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case "*":
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case "/":
                try {
                    resultado = Calculadora.dividir(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return; 
        }

        System.out.println("Resultado da operação: " + resultado);

        leitor.close();
    }
}