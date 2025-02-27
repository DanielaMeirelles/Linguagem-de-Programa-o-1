import java.util.Scanner;

public class ex_03 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário atual
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        // Solicita o percentual de reajuste
        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();

        // Calcula o novo salário
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        // Exibe o novo salário
        System.out.printf("O novo salário do funcionário será: R$ %.2f%n", novoSalario);

    }
}
