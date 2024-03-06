package AULA1;

public class Atividade4 {
    public static void main(String[] args) {
        //substituir os 0.0 pelos valores das notas
        double P1 = 0.0;
        double E1 = 0.0;
        double E2 = 0.0;
        double API = 0.0;
        double X = 0.0;
        double SUB = 0.0;

        // fórmula para calculo da media
        double mediaLP1 = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4) * 0.5 +
                          (Math.max(((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9), 0) /
                          ((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9)) * (API * 0.5) +
                          X + (SUB * 0.2);

        // Exibindo o resultado
        System.out.println("A média de LP1 é: " + mediaLP1);
    }
}
