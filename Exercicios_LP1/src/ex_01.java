import java.util.Scanner;

public class ex_01 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe a idade em anos, meses e dias
        System.out.println("Digite quantos anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite quantos meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite quantos dias: ");
        int dias = scanner.nextInt();

        // Calcula a idade total em dias
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        // Exibe o resultado
        System.out.println("A sua idade em dias é: " + idadeEmDias);

    }
}
