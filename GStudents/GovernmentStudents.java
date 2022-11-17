package GStudents;
import java.util.Scanner;

public class GovernmentStudents {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.nextLine();
		
		System.out.println("Are you a student of Kabale University ?");
		System.out.println("Enter y for yes and n for no");
		String a = input.next();
		
		if(a.equals("y") || a.equals("Y")) {
			System.out.println("You are about to receive your payment ");
			System.out.println("Kindly provide us with your registaration number[Make sure you write it in capital letters]");
			
			String reg = input.next();
			
			if(reg.contains("/G/F") || reg.contains("/g/f")) {
				System.out.println("You are a government student");
				System.out.println("Yello " + name + ", Your account has been topped up with UGX. 840,000, check your account balance to confirm this payment.");
			}else {
				System.out.println("Yello " + name + ", You are a private student, therefore you do not qualify for any allowance");
			}
			
		}else if(a.equals("n") || a.equals("N")) {
			System.out.println("Yello " + name + ", You cannot access this service if you're not a student of Kabale University");
		}

	}

}
