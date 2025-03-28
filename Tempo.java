import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos anos você deseja: ");
        int anos = sc.nextInt();

        // 365 dias, 24 horas, 60min, 60seg
        int segAno = 365 * 24 * 60 * 60;
        long totalSeg = anos * segAno;

        System.out.println(anos + " anos possui aproximadamente " + totalSeg + " segundos.");

        sc.close();
    }
    
}
