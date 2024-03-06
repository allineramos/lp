package AULA2;

import java.util.Scanner;

public class Atividade15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de horas trabalhadas em um mês e do salário por hora
        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Calculando o salário total do funcionário
        double salarioTotal;
        int horasExtras = horasTrabalhadas - 40 * 4; // Horas extras em um mês de 4 semanas
        if (horasExtras > 0) {
            double valorHoraExtra = salarioPorHora * 1.5; // 50% de acréscimo
            salarioTotal = (40 * 4 * salarioPorHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        // Exibindo o salário total do funcionário
        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }
}