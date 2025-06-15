import java.util.Scanner;

public class InnerCycleExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tmp;
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		tmp = r;
		r = Math.max(l, r);
		l = Math.min(l, tmp);

		int res = l;
		int value = 0;

		for(int i = l; i <= r; i++) {
			int current = 0;
			int j = Math.abs(i);
			while (j > 0) {
				current += j % 10;
				j /= 10;
			}
			if (current > value) {
				res = i;
				value = current;
			}
		}
		System.out.println(res);
	}
}
