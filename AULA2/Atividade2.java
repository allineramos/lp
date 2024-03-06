package AULA2;

import java.util.Scanner;

public class Atividade2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Ler o número de votos brancos
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        // Ler o número de votos nulos
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        // Ler o número de votos válidos
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Calcular percentuais
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        // Exibir resultados
        System.out.println("\nResultado da Eleição:");
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        scanner.close();
    }
}