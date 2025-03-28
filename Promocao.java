import java.util.Scanner;

public class Promocao { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço orginal do produto: R$");
        double valorOriginal = sc.nextDouble();
        
        double desconto = valorOriginal * (15.00/100.00);

        double valorFinal = valorOriginal - desconto;

        System.out.print("\nDesconto aplicado: R$" + desconto);
        System.out.printf("\nPreço final com desconto: R$ %.2f", valorFinal);

        sc.close();
    }
    
}
