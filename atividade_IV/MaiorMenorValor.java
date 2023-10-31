import java.util.Scanner;

public class MaiorMenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números na sequência: ");
        int quantidade = scanner.nextInt();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite a sequência de números: ");

        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        scanner.close();

        System.out.println("O maior valor da sequência é: " + maior);
        System.out.println("O menor valor da sequência é: " + menor);
    }
}
