package learning_java;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten");
		String name = scanner.nextLine();
		System.out.println("Nhap tuoi");
		int age = scanner.nextInt();
		System.out.println("Name is: " + name + " Age: " + age);
	}
}
