package learning_java;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập độ dài cạnh");
		int canh = scanner.nextInt();
		double thetich = Math.pow(3, canh);
		System.out.println("Thể tích của khối lập phương là: " + thetich);
		scanner.close();
	}
}
