import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		Random gen = new Random(scan.nextInt());

		int[] neg = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			boolean hasNeg = false;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = gen.nextInt(-10, 11);
				System.out.printf("%d\t", arr[i][j]);

				if (!hasNeg && arr[i][j] < 0) {
					neg[i] = j;
					hasNeg = true;
				}
			}
			if (!hasNeg) neg[i] = -1;
			System.out.println();
		}
		for (int el : neg) {
			if (el < 0) {
				System.out.println("NO");
			} else {
				System.out.println(el);
			}
		}
	}

	public static void getColumnSum() {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		Random gen = new Random(scan.nextInt());

		int[] rows = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = gen.nextInt(-10, 11);
				System.out.printf("%d\t", arr[i][j]);

				if (arr[i][j] > 0) {
					rows[j] += arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int el : rows) System.out.printf("%d ", el);
	}

	public static void twoDimMaxCount() {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		Random gen = new Random(scan.nextInt());

		int max = -6;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = gen.nextInt(-5, 5);
				System.out.printf("%d\t", arr[i][j]);

				if (arr[i][j] > max) {
					max = arr[i][j];
					cnt = 1;
				} else if (arr[i][j] == max) cnt++;
			}
			System.out.println();
		}
		System.out.printf("%d %d", max, cnt);
	}

	public static void rangeSort() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int seed = scan.nextInt();
		int l = scan.nextInt();
		int r = scan.nextInt();
		Random gen = new Random(seed);

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = gen.nextInt(10, 21);
		}
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, l, r + 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void getMinMax() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int seed = scan.nextInt();
		Random gen = new Random(seed);

		double[] arr = new double[n];
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = gen.nextDouble(0, 2);

			if (arr[i] > max) max = arr[i];
			if (arr[i] < min) min = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.printf("%f", min + max);
	}

	public static void sortAndCut() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int seed = scan.nextInt();
		int m = scan.nextInt();
		Random gen = new Random(seed);

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = gen.nextInt(2, 16);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int j = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == m) {
				j = i;
				break;
			}
		}

		if (j >= 0) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, j + 1)));
		} else {
			System.out.println("ERROR");
		}
	}
}
