import java.util.Scanner;

public class TajnaVrata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite trocifreni broj: ");
        int broj = scanner.nextInt();

        if (broj < 100 || broj > 999) {
            System.out.println("Morate uneti trocifreni broj!");
        } else {
            int A = broj / 100;      
            int B = (broj / 10) % 10; 
            int C = broj % 10;        
            int zbir = A + B + C;
            int proizvod = A * B * C;

            int kod = proizvod - zbir;

            System.out.println("Kod za otvaranje tajnih vrata je: " + kod);
        }

        
    }
}
