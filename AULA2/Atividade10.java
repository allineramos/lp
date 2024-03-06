package AULA2;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas da atividade 1 e atividade 2
        System.out.print("Digite a nota da Atividade 1: ");
        double notaAtividade1 = scanner.nextDouble();

        System.out.print("Digite a nota da Atividade 2: ");
        double notaAtividade2 = scanner.nextDouble();

        // Calculando a média aritmética simples
        double media = (notaAtividade1 + notaAtividade2) / 2;

        // Verificando se o aluno foi aprovado
        String mensagem;
        if (media >= 6.0) {
            mensagem = "Parabéns! Você foi aprovado!";
        } else {
            mensagem = "Infelizmente você foi reprovado.";
        }

        // Exibindo a média e a mensagem de aprovação/reprovação
        System.out.println("Sua média é: " + media);
        System.out.println(mensagem);

        scanner.close();
    }
}