package AULA2;

    import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o número de carros vendidos pelo vendedor
        System.out.print("Digite o número de carros vendidos pelo vendedor: ");
        int numeroCarrosVendidos = scanner.nextInt();

        // Ler o valor total das vendas efetuadas pelo vendedor
        System.out.print("Digite o valor total das vendas efetuadas pelo vendedor: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        // Ler o salário fixo do vendedor
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        // Ler o valor que o vendedor recebe por carro vendido
        System.out.print("Digite o valor que o vendedor recebe por carro vendido: R$ ");
        double valorPorCarroVendido = scanner.nextDouble();

        // Calcular a comissão por carro vendido
        double comissaoPorCarro = numeroCarrosVendidos * valorPorCarroVendido;

        // Calcular o valor das vendas (incluindo 5%)
        double valorVendasComComissao = valorTotalVendas + (0.05 * valorTotalVendas);

        // Calcular o salário final do vendedor
        double salarioFinal = salarioFixo + comissaoPorCarro + valorVendasComComissao;

        // Exibir o salário final do vendedor
        System.out.println("\nO salário final do vendedor é: R$ " + salarioFinal);

        scanner.close();
    }
}