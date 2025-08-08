package learning_java;

import java.util.Scanner;

public class Bai06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tính phương trình ax + b = 0");
		System.out.println("Nhập a");
		int a = scanner.nextInt();
		System.out.println("Nhập b");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("PT có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("PT vô nghiệm");
		} else {
			double x = -b / a;
			System.out.println("Giá trị của x = " + x);
		}
	}
}
