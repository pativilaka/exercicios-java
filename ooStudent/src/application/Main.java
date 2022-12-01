package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		stu.name = sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		if (stu.results() != "FAILED") {
			System.out.println(stu);
		} else {
			System.out.println(stu);
			System.out.println("MISSING " + stu.missingPoints() + " POINTS");
		}
		
		sc.close();
		
	}

}
