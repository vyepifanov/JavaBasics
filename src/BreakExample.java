import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int r = scanner.nextInt();

		int value = 0;
		for (int i = l; i <= r; i++) {
			int divider = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					divider = j;
					break;
				}
			}
			value += divider;
		}
		System.out.println(value);
	}
}