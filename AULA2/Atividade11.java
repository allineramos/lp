package AULA2;

import java.util.Scanner;

public class Atividade11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do ano atual e do ano de nascimento
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Calculando a idade da pessoa
        int idade = anoAtual - anoNascimento;

        // Verificando se a pessoa poderá votar
        if (idade >= 16) {
            System.out.println("Você poderá votar este ano!");
        } else {
            System.out.println("Você não poderá votar este ano!");
        }

        scanner.close();
    }
}