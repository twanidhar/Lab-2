package duration;

import java.util.Scanner;

public class LabAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter the earlier month"); //user enter in the first month
			Scanner scan= new Scanner (System.in); // 
			int month1 = scan.nextInt();
			System.out.println("Enter the earlier day");
			int day1 = scan.nextInt();
			System.out.println("Enter the earlier year");
			int year1 = scan.nextInt(); 
			
			System.out.println("Enter later month");
			int month2 = scan.nextInt();
			System.out.println("Enter later day");
			int day2 = scan.nextInt();
			System.out.println("Enter later year");
			int year2 = scan.nextInt();
			
			
			
			int date2 = (year2 * 365 + month2 * 30) + day2;//an equation to create a time difference
			int date1 = (year1 * 365 + month1 * 30) + day1;//an equation to create a time difference 
			
			int timeDifference = date2- date1;//time duration is later date - earlier date.
			int year = timeDifference/ 365;
			int month= (timeDifference % 365)/30;
			int day = (timeDifference % 365) % 30;
			System.out.println("The time difference is:" + date2 +  " - " + date1 + " = " + timeDifference + " day(s) "); 
			//gives the time difference in number of days.
	}}
