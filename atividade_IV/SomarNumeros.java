import java.util.Scanner;

public class SomarNumeros {
    
    public static void main(String[] args) throws Exception {
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Digite um numero para somar seus anteriores: ");
        int N = teclado.nextInt();
        teclado.close();
        
        int soma = CalcularSoma(N);
        String somaString = GerarStringSoma(N);
        System.out.printf("A soma dos numeros " + somaString + " é: " + soma);
    }
        
        public static int CalcularSoma(int N) {
            int soma = 0;
            for (int i = 1; i <= N; i++) {
                soma += i;
            }
            return soma;
    }
    
        public static String GerarStringSoma(int N) {
            StringBuilder sb = new StringBuilder();
            
            for (int i = 1; i < N; i++) {
                sb.append(i).append(" + ");
            }
            sb.append(N);
            return sb.toString();
    }
}