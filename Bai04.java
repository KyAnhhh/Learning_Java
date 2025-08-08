package learning_java;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thuế");
		int thue = scanner.nextInt();
		if (thue < 10) {
			System.out.println("Không đóng thuế");
		}
		if (thue >= 10 && thue < 15) {
			System.out.println("Đóng thuế 10%");
		}
		if (thue >= 15 && thue < 30) {
			System.out.println("Đóng thuế 20%");
		}
		if (thue > 30) {
			System.out.println("Đóng thuế 50%");
		}
	}
}
