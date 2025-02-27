import java.util.Scanner;

public class ex_04 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        // Definindo as porcentagens do distribuidor e dos impostos
        double percentualDistribuidor = 28.0; // 28%
        double percentualImpostos = 45.0; // 45%

        // Calculando o valor do distribuidor e dos impostos
        double valorDistribuidor = (percentualDistribuidor / 100) * custoFabrica;
        double valorImpostos = (percentualImpostos / 100) * custoFabrica;

        // Calculando o custo final ao consumidor
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        // Exibindo o custo final ao consumidor
        System.out.println("O custo final do carro ao consumidor é: R$ " + custoFinal);
    }
}
