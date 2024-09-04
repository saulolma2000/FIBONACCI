import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        boolean pertence = verificaFibonacci(numero);

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
    public static boolean verificaFibonacci(int numero) {
        int a = 0;
        int b = 1;

        if (numero == a || numero == b) {
            return true;
        }
        int proximo = a + b;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }
        return false;
    }
}
