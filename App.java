import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1 */
    Scanner sc = new Scanner(System.in);
    int N = 0;
    System.out.println("Informe o valor de N:");
    N = sc.nextInt();
    int fatorial = 1;

    for(int i = N; i >= 1; i--){
        fatorial *= i;
    }
    System.out.println("O fatorial de " + N + " é: " + fatorial);
    }
}
