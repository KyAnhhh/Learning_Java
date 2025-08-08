package learning_java;

import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tính phương trình ax2 + bx = 0");
		System.out.println("Nhập hệ số bậc hai của a");
		int a = scanner.nextInt();
		System.out.println("Nhập b");
		int b = scanner.nextInt();
		System.out.println("Nhập c");
		int c = scanner.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else {
				System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
			}
			return;
		}
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;

		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}

	}
}
