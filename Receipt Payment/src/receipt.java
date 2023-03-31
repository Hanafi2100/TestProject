import java.util.Scanner;

public class receipt {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String item1 ="";
		int quantityItem1 = 0 ;
		double priceItem1 = 0 ;
		
		String item2 = "";
		int quantityItem2 = 0 ;
		double priceItem2 = 0 ;
		
		System.out.print("Item 1 :");
		item1 = sc.nextLine();
		System.out.print("Quantity :");
		quantityItem1 = sc.nextInt();
		System.out.print("unit price :");
		priceItem1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Item 2 :");
		item2 = sc.nextLine();
		System.out.print("Quantity :");
		quantityItem2 = sc.nextInt();
		System.out.print("unit price :");
		priceItem2 = sc.nextDouble();
		
		double govermentTax = 0.70;
		double serviceCharge = 1.16;
		double totalpriceItem1 = quantityItem1 * priceItem1 ;
		double totalpriceItem2 = quantityItem2 * priceItem2 ;
		double subtotal =  totalpriceItem1 + totalpriceItem2 ;
		double Total = subtotal +govermentTax + serviceCharge;
		
		System.out.println("Total :" + (Total));
		System.out.println("Total :" + String.format("%.1f",Total));
		System.out.println("Total :" + String.format("%.2f",Total));
}
}
