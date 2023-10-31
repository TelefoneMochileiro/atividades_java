import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();
        scanner.close();

        if (verificarPalindromo(entrada)) {
            System.out.println(entrada + " é um palíndromo.");
        } else {
            System.out.println(entrada + " não é um palíndromo.");
        }
    }
    
    public static boolean verificarPalindromo(String entrada) {
        String processado = entrada.replaceAll("\\s+", "").toLowerCase();
        int esquerda = 0;
        int direita = processado.length() - 1;

        while (direita > esquerda) {
            if (processado.charAt(esquerda) != processado.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}