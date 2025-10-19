import java.util.Scanner;

public class ZavjesaProzor {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite gornju lijevu koordinatu zavjese:");
        double zavjesaX1 = unos.nextDouble();
        double zavjesaY1 = unos.nextDouble();
        System.out.println("Unesite donju desnu koordinatu zavjese:");
        double zavjesaX2 = unos.nextDouble();
        double zavjesaY2 = unos.nextDouble();

        System.out.println("Unesite gornju lijevu koordinatu prozora:");
        double prozorX1 = unos.nextDouble();
        double prozorY1 = unos.nextDouble();
        System.out.println("Unesite donju desnu koordinatu prozora:");
        double prozorX2 = unos.nextDouble();
        double prozorY2 = unos.nextDouble();

        double sirinaZavjese = zavjesaX2 - zavjesaX1;
        double visinaZavjese = zavjesaY1 - zavjesaY2;

        double sirinaProzora = prozorX2 - prozorX1;
        double visinaProzora = prozorY1 - prozorY2;

        if (sirinaZavjese >= sirinaProzora && visinaZavjese >= visinaProzora) {
            System.out.println("Zavjesa prekriva prozor.");
        } else {
            System.out.println("Zavjesa NE prekriva prozor.");
        }

        unos.close();
    }
}
