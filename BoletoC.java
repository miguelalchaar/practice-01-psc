import java.util.Scanner;

public class BoletoC {
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

        //Valor Total dos Boletos
        System.out.printf("O valor total de todos os seus boletos é R$ %.2f", valorTotal);

        //Salário Bruto
        System.out.println("\n\nDigite o valor do seu salário bruto: ");
        double salarioB = sc.nextDouble();
        //Calculando o Salário Liquido com 14% de desconto
        //100% - 14% = 86%
        double salarioL = salarioB * 0.86;

        System.out.printf("\n\nO seu salário Líquido é: R$ %.2f", salarioL);

        //Calcular o valor de sobra ou falta
        double saldoFinal = salarioL - valorTotal;

        if (saldoFinal >= 0) {
            System.out.printf("\nUfa, as contas foram pagas, sobrou R$ %.2f", saldoFinal);
        } else {
            System.out.printf("\nDeu ruim, está faltando dinheiro. O seu saldo é R$ %.2f", saldoFinal);
        }

        sc.close();
    }
    
}
