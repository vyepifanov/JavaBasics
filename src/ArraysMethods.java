import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] mas = new int[scan.nextInt()][scan.nextInt()];
		long seed = scan.nextLong();
		int ind = scan.nextInt();
		initArray(mas, seed);
		printArray(mas);
		System.out.println();
		mas = deleteRow(mas, ind);
		printArray(mas);
	}

	public static void initArray(int[][] arr, long seed) {
		Random gen = new Random(seed);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = gen.nextInt(0, 11);
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int[] row : arr) {
			for (int el : row) System.out.printf("%d\t", el);
			System.out.println();
		}
	}

	public static void printMaxIndex(int[][] arr) {
		for (int[] row : arr) {
			int res = 0;
			for (int i = 1; i < row.length; i++) {
				if (row[res] < row[i]) res = i;
			}
			System.out.printf("%d ", res);
		}
	}

	public static int[][] deleteRow(int[][] arr, int ind) {
		if (ind < 0 || ind >= arr.length) {
			return arr;
		}
		int[][] res = new int[arr.length - 1][arr[0].length];
		int row_index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (i == ind) continue;
			row_index++;
			for (int j = 0; j < arr[i].length; j++) {
				res[row_index][j] = arr[i][j];
			}
		}

		return res;
	}

	public static void init(int[] arr, long seed) {
		Random gen = new Random(seed);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = gen.nextInt(-3, 6);
		}
	}

	public static void print(int[] arr) {
		for (int el : arr) System.out.printf("%d ", el);
		System.out.println();
	}

	public static int findMax(int[] arr) {
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[res] < arr[i]) res = i;
		}

		return res;
	}

	public static int[] reduceAfterMax(int[] arr) {
		return Arrays.copyOf(arr, findMax(arr) + 1);
	}
}
