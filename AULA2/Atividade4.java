package AULA2;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Calcular o custo do distribuidor (28% do custo de fábrica)
        double custoDistribuidor = custoFabrica * 0.28;

        // Calcular o valor dos impostos (45% do custo de fábrica)
        double valorImpostos = custoFabrica * 0.45;

        // Calcular o custo final ao consumidor
        double custoFinal = custoFabrica + custoDistribuidor + valorImpostos;

        // Exibir o custo final ao consumidor
        System.out.println("\nO custo final ao consumidor é: R$ " + custoFinal);

        scanner.close();
    }
}