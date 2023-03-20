package Pattern;

import java.util.Scanner;

public class SquareMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter order of sq matrix-:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int a=1;a<=n;a++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}