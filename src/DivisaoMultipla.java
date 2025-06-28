import java.util.Scanner;

public class DivisaoMultipla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial (base): ");
        int base = scanner.nextInt();

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Ignora números menores que o número inicial
            if (numero < base) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue;
            }

            // Verifica se o número é múltiplo da base
            if (numero % base != 0) {
                System.out.println("Número não é múltiplo da base. Encerrando...");
                break;
            }

            System.out.println("Número válido e múltiplo da base.");
        }

        scanner.close();
    }
}
