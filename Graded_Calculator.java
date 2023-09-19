import java.util.Scanner;
public class Graded_Calculator{
	/*Input: Take marks obtained (out of 100) in each subject.
	Calculate Total Marks: Sum up the marks obtained in all subjects.
	Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
	average percentage.
	Grade Calculation: Assign grades based on the average percentage achieved.
	Display Results: Show the total marks, average percentage, and the corresponding grade to the use*/
	public static void main(String[]args) {
    // Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Five subjects marks Accordingly out of 100");
		
		int subject_1=sc.nextInt();
		int subject_2=sc.nextInt();
		int subject_3=sc.nextInt();
		int subject_4=sc.nextInt();
		int subject_5=sc.nextInt();
		int total_marks=subject_1+subject_2+subject_3+subject_4+subject_5;
		char grades=' ';
		int average_p=((subject_1+subject_2+subject_3+subject_4+subject_5)/5);
		if(average_p<=10 && average_p<30) {
			grades='E';
		}if(average_p>=30 && average_p<50) {
			grades='D';
		}if(average_p>=50 && average_p<70) {
			grades='C';
		}if(average_p>=70 && average_p<90) {
			grades='B';
		}if(average_p>=90 && average_p>=100) {
			grades='A';
		}
		// Displaying
		System.out.println("Your result: \nTotal Marks="+total_marks+"\nAverage Percentage="+average_p+"%\n"+"Grades="+grades);
		
		
		
		
	}
	
	
	
	
	
	
}
