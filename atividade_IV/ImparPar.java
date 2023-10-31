import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) throws Exception {
        Scanner teclado =  new Scanner(System.in);
        int numero, par, resultado;
        par = 0;
        
        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();
        
        resultado = numero % 2;
        
        if (resultado == par) {
            System.out.printf("O numero " + numero + " é Par");
        } 
        
        else {
            System.out.printf("O numero " + numero + " é Impar");
        }
            teclado.close();
    }
}