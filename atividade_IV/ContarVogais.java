import java.util.Scanner;

public class ContarVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        int contadorVogais = contarVogais(frase);

        System.out.println("O número de vogais na frase é: " + contadorVogais);
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        return contador;
    }
}
    