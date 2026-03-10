package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;


public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.score1 = sc.nextDouble();
		student.score2 = sc.nextDouble();
		student.score3 = sc.nextDouble();
		
		student.testApprove();
		
		
		sc.close();
	}

}
