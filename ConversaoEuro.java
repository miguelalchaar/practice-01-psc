import java.util.Scanner;

public class ConversaoEuro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$");
        double real = sc.nextDouble();

        double euro = real / 6.204; 

        System.out.printf("\nValor equivalente em Euros: $ %.2f", euro);

        sc.close();
    }

}
