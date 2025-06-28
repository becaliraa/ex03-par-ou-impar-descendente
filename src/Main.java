import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dois números
        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();

        int fim;
        do {
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            fim = scanner.nextInt();
        } while (fim <= inicio);

        // Escolha entre par ou ímpar
        System.out.print("Digite 'P' para pares ou 'I' para ímpares: ");
        char escolha = scanner.next().toUpperCase().charAt(0);

        System.out.println("\nNúmeros " + (escolha == 'P' ? "pares" : "ímpares") + " no intervalo, em ordem decrescente:");

        // Laço do número final até o número inicial (ordem decrescente)
        for (int i = fim; i >= inicio; i--) {
            if (escolha == 'P' && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (escolha == 'I' && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
