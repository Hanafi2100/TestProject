import java.util.Scanner;

public class Exercise3 {
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Retail price");
	        double retail = sc.nextDouble();
	        
	        System.out.println("Sales tax rate:");
	        double sales_tax_rate= sc.nextDouble() ;
	        
	        double salesTax =retail * sales_tax_rate/100 ;
	        double total = retail + salesTax;
	        
	        
	        
	  
	        
	        System.out.println("sale tax is " + String.format("%.2f",salesTax));
	        System.out.println("Total= " + String.format("%.2f", total));
	        
	        	
           
	        
	        
	  
			
			

		

		
		}

}