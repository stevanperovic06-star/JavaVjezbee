import java.util.Scanner ;
public class Zadatak_2 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("Unesite duzinu papira (u mm)");
		 double duzinaMm = scanner.nextDouble(); 
		 System.out.println("Unesite sirinu (u mm)");
		 double sirinaMm = scanner.nextDouble();
		 
		 double duzinaCm = duzinaMm / 10;
		 double sirinaCm = sirinaMm /10;
		  double povrsina = duzinaCm * sirinaCm;
		  System.out.println("Povrsina papira je " + povrsina +" cm kvadratnim");
				 
		 
	 }
}
