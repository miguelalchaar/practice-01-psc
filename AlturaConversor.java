import java.util.Scanner;

public class AlturaConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura em metros: ");
        double alturaMetros = scanner.nextDouble();

        double alturaCm = alturaMetros * 100;

        //1 pé = 30,48 cm | Calcula a quantidade de pés
        int pes = (int) (alturaCm / 30.48);

        //Calcula o restante em centímetros e converte para polegadas
        double restanteCm = alturaCm % 30.48;

        //1 polegada = 2,54 cm | Calcula a quantidade de polegadas
        double polegadas = restanteCm / 2.54;

        System.out.println(alturaMetros + " metros equivalem a " + pes + " pés e " + polegadas + " polegadas.");

        scanner.close();
    }
}
