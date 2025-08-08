package learning_java;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		int height = scanner.nextInt();
		System.out.println("Nhập chiều rộng: ");
		int width = scanner.nextInt();

		int chuvi = (height + width) * 2;
		int dientich = height * width;
		int canhnhonhat = Math.min(height, width);
		System.out.println("Chu vi = " + chuvi);
		System.out.println("Diện tích = " + dientich);
		System.out.println("Cạnh nhỏ nhất = " + canhnhonhat);
	}
}
