import java.util.Scanner;

public class GerarSequenciaFibonnaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de N para gerar os primeiros termos da sequência de Fibonacci: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("Os primeiros " + N + " termos da sequência de Fibonacci são: ");
        for (int i = 0; i < N; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
