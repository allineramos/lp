package AULA2;
import java.util.Scanner;
public class Atividade13 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Verificando e escrevendo os valores em ordem crescente
        if (valor1 < valor2) {
        System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2);
        } else {
        System.out.println("Os valores em ordem crescente são: " + valor2 + ", " + valor1);
        }

        scanner.close();
    }
}