import java.util.Scanner;

public class Zid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite x koordinatu gornje lijeve tačke: ");
        double x1 = scanner.nextDouble();

         System.out.print("Unesite y koordinatu gornje lijeve tačke: ");
        double y1 = scanner.nextDouble();

        System.out.print("Unesite x koordinatu donje desne tačke: ");
        double x2 = scanner.nextDouble();

          System.out.print("Unesite y koordinatu donje desne tačke: ");
          double y2 = scanner.nextDouble();
       
        double sirina = Math.abs(x2 - x1);
        double visina = Math.abs(y1 - y2);
       
        double povrsina = sirina * visina;
        double obim = 2 * (sirina + visina);
        System.out.println("Površina zida je: " + povrsina);
        System.out.println("Obim zida je: " + obim);

        scanner.close();
    }
}
