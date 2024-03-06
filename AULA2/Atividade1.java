package AULA2;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a idade em anos: ");
            int anos = scanner.nextInt();

            System.out.println("Digite a idade em meses: ");
            int meses = scanner.nextInt();

            System.out.print("Digite a idade em dias: ");
            int dias = scanner.nextInt();

            // Calcular a idade em dias
            int idadeEmDias = (anos * 365) + (meses * 30) + dias;

            // Exibir a idade em dias
            System.out.println("A idade expressa em dias é: " + idadeEmDias + " dias");
        } finally {
            scanner.close();
        }
    }
}