import java.util.Scanner;

public class Stolnjak {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     
    System.out.print("Unesite površinu stoljnjaka (u cm²): ");
    double povrsina = scanner.nextDouble();
    double poluprecnik = Math.sqrt(povrsina / Math.PI);
    double obim = 2 * Math.PI *poluprecnik;
    System.out.println("Potrebna dužina trake za ivicu stoljnjaka je: " + obim + " cm");

     scanner.close();
    }
}
