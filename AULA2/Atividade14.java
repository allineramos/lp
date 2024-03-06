package AULA2;
    import java.util.Scanner;
public class Atividade14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da hora de início e da hora de fim do jogo
        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        // Calculando a duração do jogo
        int duracao;
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        // Exibindo a duração do jogo
        System.out.println("A duração do jogo é de " + duracao + " horas.");

        scanner.close();
    }
}