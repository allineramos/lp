package AULA2;
import java.util.Scanner;
public class Atividade9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de maçãs compradas:");
        int quantidade = scanner.nextInt();
        
        double custoTotal;
        
        if (quantidade < 12) {
            custoTotal = quantidade * 1.30;
        } else {
            custoTotal = quantidade * 1.00;
        }
        
        System.out.println("O custo total da compra é: R$ " + custoTotal);
        
        scanner.close();
    }
}