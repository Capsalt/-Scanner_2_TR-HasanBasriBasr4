import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		int kenar = scan.nextInt();
		
		int cevre = kenar * 4;
		int alan = kenar* kenar;
		
		System.out.println("Alan: " + alan + "\nCevre: " + cevre);


         }
}