package Exercise;

import java.util.Scanner;

public class Bai4 {
	protected void bai4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int n = sc.nextInt();
		String res = n % 2 == 0 ? "Số chẵn" : "Số lẻ";
		System.out.printf("%d là %s", n, res);
	}
}
