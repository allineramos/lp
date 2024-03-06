package AULA2;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// Leitura dos dois valores
	System.out.print("Digite o primeiro valor: ");
	double valor1 = scanner.nextDouble();
	
	System.out.print("Digite o segundo valor: ");
	double valor2 = scanner.nextDouble();
	
	// Verificando e exibindo o maior valor
	if (valor1 > valor2) {
	System.out.println("O maior valor é: " + valor1);
	} else {
	System.out.println("O maior valor é: " + valor2);
	}
	
	scanner.close();
}
}