
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("miles");
        int miles= scanner.nextInt();
        
        
        
  
		
		double total = 1.6 * miles;
		// Display results
		System.out.println(total);
		System.out.println("Total=" + String.format("%.2f",total));
	

	}
}
