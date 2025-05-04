package Exercise;

import java.util.Scanner;

public class Bai5 {
	protected void bai5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int n = sc.nextInt();
		String res = n > 0 ? "Số dương" : (n == 0 ? "Số 0" : "Số âm");
		System.out.printf("%d là %s", n, res);
	}
}
