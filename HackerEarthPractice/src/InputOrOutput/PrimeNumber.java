package InputOrOutput;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        		int flag = 1;
		System.out.print(2 + " ");
		for (int i = 1; i < N; i++) {
			flag = 1;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else if (flag == 1) {
					System.out.print(i + " ");
					break;
				}
			}

		}
	}

}
