package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Enter rectangle width and height\nWidth: ");
		retangulo.width = sc.nextDouble();
		
		System.out.print("Height: ");
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		
		
		sc.close();
	}

}
