import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int tp = scan.nextInt();
//		double s = switch(tp) {
//			case 1 -> square(scan.nextDouble());
//			case 2 -> square(scan.nextDouble(), scan.nextDouble());
//			default -> 0;
//		};
//		System.out.printf("%.2f", s);

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
		System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
	}

	static double average(int x, int y) {
		return (x + y) / 2.0;
	}

	static double average(double x, double y) {
		return (x + y) / 2.0;
	}

	static double average(int x, int y, int z) {
		return (x + y + z) / 3.0;
	}

	static double average(double x, double y, double z) {
		return (x + y + z) / 3.0;
	}

	static double square(double x) {
		return Math.pow(x, 2);
	}

	static double square(double x, double y) {
		return x * y;
	}

	static void printTriangle(int w, String c) {
		int h = (w + 1) / 2;
		int s = w % 2 == 0 ? w / 2 - 1 : w / 2;
		int f = w - 2 * s;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <=s + f; j++) {
				if (j <= s) {
					System.out.print(" ");
				} else {
					System.out.print(c);
				}
			}
			s--;
			f += 2;
			System.out.println();
		}
	}

	static int maxNumberDivider(int l, int r) {
		int res = l;
		int currentMax = 0;

		for (int i = l; i <= r; i++) {
			int cur = getDividersCount(i);
			if (currentMax < cur) {
				currentMax = cur;
				res = i;
			}
		}

		return res;
	}

	static int getDividersCount(int a) {
		int res = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) res++;
		}

		return res;
	}

	static void printDivider(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) System.out.printf("%d ", i);
		}
	}

	static int simpleInRange(int l, int r) {
		int res = 0;
		int tmp = r;
		r = Math.max(l, r);
		l = Math.min(l, tmp);

		for (int i = l; i <= r; i++) {
			if (isPrime(i)) res++;
		}

		return res;
	}

	static boolean isPrime(int num) {
		if (num <= 1) return false;

		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
