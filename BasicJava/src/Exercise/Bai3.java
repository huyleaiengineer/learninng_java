package Exercise;

import java.util.Scanner;

class Bai3 {
	protected void bai3() {
		final float PI = 3.1416f;
		Scanner sc = new Scanner(System.in);
		float r;
		do {
			System.out.print("Chiều bán kính hình tròn: ");
			r = sc.nextFloat();
			if (r == 0)
				System.out.println("Bán kính phải khác 0 ");
		} while (r == 0);
		
		System.out.printf("Chu vi hình tròn = %f\n", 2*PI*r);
		System.out.printf("Diện tích tròn = %f\n", PI*r*r);
	}
}
