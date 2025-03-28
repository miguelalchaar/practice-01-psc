import java.util.Scanner;

public class BoletoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bolt1, bolt2, bolt3, bolt4, valorTotal;

        System.out.println("Digite o valor do seu 1° boleto: ");
        bolt1 = sc.nextDouble();

        System.out.println("Digite o valor do seu 2° boleto: ");
        bolt2 = sc.nextDouble();

        System.out.println("Digite o valor do seu 3° boleto: ");
        bolt3 = sc.nextDouble();

        System.out.println("Digite o valor do seu 4° boleto: ");
        bolt4 = sc.nextDouble();

        valorTotal = bolt1 + bolt2 + bolt3 + bolt4;

        System.out.printf("O valor total de todos os seus boletos é R$ %.2f", valorTotal);

    
        sc.close();
    }
}
