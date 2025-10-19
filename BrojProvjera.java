import java.util.Scanner;

public class BrojProvjera {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int broj = scanner.nextInt();
		
		boolean paran = (broj % 2 == 0);
		boolean pozitivan = (broj >= 0);
		
		if ( pozitivan && paran) {
			System.out.println("Broj je pozitivan i paran!");
		}else if (pozitivan && !paran) {
			System.out.println("Broj pozitivan i neparan!");
		}else if (!pozitivan && paran){
			System.out.println("Broj je negativan i paran!");
		}else if (!pozitivan && !paran) {
			System.out.println("Broj je negativan i neparan!");
		}
		
		
		
		

	}

}
