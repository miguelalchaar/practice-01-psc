import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual o valor do primeiro produto: ");
        double valor1 = sc.nextDouble();

        System.out.println("Informe qual o valor do segundo produto: ");
        double valor2 = sc.nextDouble();

        System.out.println("Informe qual o valor do terceiro produto: ");
        double valor3 = sc.nextDouble();

        System.out.print("O valor dado foi: R$");
        double valorPago = sc.nextDouble();

        double valorTotal = valor1 + valor2 + valor3; 
        double troco = valorPago - valorTotal;

        if (valorPago > valorTotal) {
            System.out.printf("Volte sempre! O Seu troco foi de R$ %.2f", troco);
        } else {
            System.out.println("O valor de R$" + valorPago + " não foi suficiente.");
        }

            sc.close();
    
    }
}