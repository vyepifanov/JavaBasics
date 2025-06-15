import java.util.Scanner;

public class ForExample {
	static final int N = 10;

	public static void main(String[] args) {
		int result = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			if (scanner.nextInt() < 4) {
				result++;
			}
		}
		System.out.println(result);
	}

	public static void getInterval () {
		Scanner scanner = new Scanner(System.in);
		int tmp;
		int l = scanner.nextInt();
		int r = scanner.nextInt();

		tmp = Math.min(l , r);
		r = Math.max(l, r);
		l = tmp;

		double result = 1;
		while (l <= r) {
			result *= l;
			l++;
		}

		System.out.printf("%f", result);
	}
}
