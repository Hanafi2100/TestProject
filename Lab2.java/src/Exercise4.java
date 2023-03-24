import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("integer number between 0 to 1000:");
    int number =sc.nextInt();
    
    int t1 = 1 + (number - 100)/ 100;
    int t2 = (1 + (number-10)/10)%10;
    int t3 = number % 10;
    
    int product = t1 * t2 * t3;
    
    System.out.println("Result=" + product);
    
    
    
    
	}
   
}
