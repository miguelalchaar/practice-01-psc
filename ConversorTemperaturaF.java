import java.util.Scanner;

public class ConversorTemperaturaF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua temperatura em graus Celsius: ");
        int grauC = sc.nextInt();

        double grauF = (1.8 * grauC + 32);

        System.out.printf("Sua temperatura é " + grauC + " C° e convertendo para Fahrenheit é %.1f", grauF);
        System.out.print("°F");

        sc.close();
    }
    
}
