import java.util.Scanner;

public class AreaComodo {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

         //Cômodo 1
         System.out.println("-----Cômodo 1:-----");
         System.out.print("Digite a largura (m): ");
         double largura1 = sc.nextDouble();

         System.out.print("Digite o comprimento (m): ");
         double comprimento1 = sc.nextDouble();
         double areaComodo1 = largura1 * comprimento1;

         System.out.println("Área do cômodo 1: " + areaComodo1 + " m²\n");

 
         //Cômodo 2
         System.out.println("-----Cômodo 2:-----");
         System.out.print("Digite a largura (m): ");
         double largura2 = sc.nextDouble();

         System.out.print("Digite o comprimento (m): ");
         double comprimento2 = sc.nextDouble();
         double areaComodo2 = largura2 * comprimento2;

         System.out.println("Área do cômodo 2: " + areaComodo2 + " m²\n");

         //Cômodo 3
         System.out.println("-----Cômodo 3:-----");
         System.out.print("Digite a largura (m): ");
         double largura3 = sc.nextDouble();

         System.out.print("Digite o comprimento (m): ");
         double comprimento3 = sc.nextDouble();
         double areaComodo3 = largura3 * comprimento3;

         System.out.println("Área do cômodo 3: " + areaComodo3 + " m²\n");

         double areaTotal = areaComodo1 + areaComodo2 + areaComodo3;

         System.out.println("Área total da casa: " + areaTotal + " m²");

         sc.close();
    }
}
