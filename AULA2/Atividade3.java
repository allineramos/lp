package AULA2;
    import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o salário mensal atual do funcionário
        System.out.print("Digite o salário mensal atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        // Ler o percentual de reajuste
        System.out.print("Digite o percentual de reajuste (em %): ");
        double percentualReajuste = scanner.nextDouble();

        // Calcular o valor do reajuste
        double valorReajuste = salarioAtual * (percentualReajuste / 100);

        // Calcular o novo salário
        double novoSalario = salarioAtual + valorReajuste;

        // Exibir o novo salário
        System.out.println("\nNovo salário após o reajuste: R$ " + novoSalario);

        scanner.close();
    }
}