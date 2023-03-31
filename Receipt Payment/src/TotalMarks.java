import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
      
       double firsttestMarks = 0 ;
       double percentageFirsttest = 0 ;
       
       
       double secondtestMarks = 0 ;
       double percentageSecondtest = 0 ;
       
     
       double percentageAssignments = 0 ;
       
       double percentageFinalexamination = 0 ;
       
       System.out.print("First Test Marks: ");
       firsttestMarks = sc.nextDouble();
       System.out.print("First Test Percentage");
       percentageFirsttest= sc.nextDouble();
       
       System.out.print("Second Test Marks: ");
       secondtestMarks = sc.nextDouble();
       System.out.print("Second Test Percentage");
       percentageSecondtest= sc.nextDouble();
       
       
   
       System.out.print("Assignments Percentage");
       percentageAssignments= sc.nextDouble();
       
       System.out.print("Final Exam Percentage");
       percentageFinalexamination= sc.nextDouble();
       
       double totalMark = percentageFirsttest +  percentageSecondtest + percentageAssignments + percentageFinalexamination;
       System.out.println("Total Mark :" + String.format("%.2f",totalMark));
       
       
	}
	

}
