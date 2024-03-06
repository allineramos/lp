package AULA2;
import java.util.Scanner;
public class Atividade6 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converte Fahrenheit para Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Exibe o resultado
        System.out.println("A temperatura em graus Celsius é: " + celsius);

        scanner.close();
    }
}