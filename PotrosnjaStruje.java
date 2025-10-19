import java.util.Scanner;

public class PotrosnjaStruje {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite broj domaćinstava: ");
        int N = unos.nextInt();

        double ukupno = 0;
        double preko500 = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Unesite potrošnju za domaćinstvo " + i + " (kWh): ");
            double potrosnja = unos.nextDouble();

            ukupno += potrosnja;

            if (potrosnja > 500) {
                preko500 += potrosnja;
            }
        }

        System.out.println("Ukupna potrošnja svih domaćinstava: " + ukupno + " kWh");
        System.out.println("Ukupna potrošnja domaćinstava sa >500 kWh: " + preko500 + " kWh");

       
    }
}
