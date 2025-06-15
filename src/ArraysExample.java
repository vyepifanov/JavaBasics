import java.util.Random;
import java.util.Scanner;

public class ArraysExample
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int seed = scan.nextInt();

		Random gen = new Random(seed);
		int[] arr = new int[n];

		int max = 0;
		int neg = 0;
		boolean hasNegative = false;

		for (int i = 0; i < n; i++) {
			arr[i] = gen.nextInt(-5, 16);
			System.out.printf("%d ", arr[i]);

			if (arr[max] < arr[i]) max = i;
			if (arr[i] < 0) {
				hasNegative = true;
				neg = i;
			}
		}

		if (hasNegative) {
			int tmp = arr[max];
			arr[max] = arr[neg];
			arr[neg] = tmp;
		}

		System.out.println();
		for (int el : arr) System.out.printf("%d ", el);
	}

	public static void replaceMin() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int min = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			if (arr[min] <= arr[i]) min = i;
		}
		arr[min] = -1;
		for (int el : arr) System.out.printf("%d ", el);
	}

	public static void getAverage() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int seed = scan.nextInt();

		Random gen = new Random(seed);
		double[] arr = new double[n];
		double sum = 0;
		double pr = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = gen.nextDouble(0, 5);
			sum += arr[i];
			System.out.printf("%.2f ", arr[i]);
		}
		double average = sum / n;
		System.out.printf("%n%.2f%n", average);

		for (double el : arr) {
			System.out.printf("%.2f ", Math.min(el, average));
		}
	}

	public static void getSumProduct() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int seed = scan.nextInt();

		Random gen = new Random(seed);
		int[] arr = new int[n];
		double sum = 0;
		double pr = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = gen.nextInt(-5, 6);
			if (arr[i] >= 0) sum += arr[i];
			else pr *= arr[i];

			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("%n%.0f %.0f", sum, pr);
	}
}
