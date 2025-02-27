import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array de métodos (cada índice corresponde a um exercício)
        Runnable[] exercicios = {
                ex_01::executar,
                ex_02::executar,
                ex_03::executar,
                ex_04::executar
        };

        int opcao = -1;
        do {
            try {
                // Menu de opções
                System.out.println("\n===== MENU DE EXERCÍCIOS =====");
                System.out.println("Escolha um exercício para executar (1 a " + exercicios.length + "):");
                System.out.println("0 - Sair");
                System.out.print("Digite sua opção: ");

                // Verifica se a entrada é válida antes de ler
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt(); // Lê a opção
                    if (scanner.hasNextLine()) {
                        scanner.nextLine();}
                } else {
                    System.out.println("Entrada inválida! Digite um número.");
                    scanner.nextLine(); // Descarta a entrada errada
                    continue; // Volta ao menu
                }

                // Processa a opção escolhida
                if (opcao > 0 && opcao <= exercicios.length) {
                    System.out.println("\n--- Executando Exercício " + opcao + " ---");
                    exercicios[opcao - 1].run(); // Executa o exercício correspondente
                } else if (opcao != 0) {
                    System.out.println("Opção inválida! Escolha um número entre 1 e " + exercicios.length);
                }

            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scanner.nextLine(); // Evita loop infinito se houver erro de entrada
            }
        }while (opcao != 0);

        System.out.println("Encerrando o programa...");
        scanner.close();
    }
}
