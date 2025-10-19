import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		System.out.print("Unesite cijeli broj:");
 		int N = scanner.nextInt();
 		 
 		if(N % 3==0 && N % 5 ==0) {
 			System.out.println("FizzBuzz");
 		}else if (N % 3==0 ) {
 			System.out.println("Buzz");
 		}else if (N % 5 ==0) {
 			System.out.println("Fizz");
 		}else {
 			System.out.println(N);
 		}
 		
 		

	}

}
