import java.util.Arrays;
import java.util.Scanner;

public class StringExamples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().trim().split(" +");

		for (String word : words) {
			System.out.printf("%s%s ", word.substring(0, 1).toUpperCase(), word.substring(1));
		}
	}

	static void printLongestWord() {
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().trim().split(" +");
		String maxWord = words[0];

		for (String word : words) {
			if (word.length() > maxWord.length()) maxWord = word;
		}

		System.out.println(maxWord);
	}

	static String delCom(String str) {
		if (str.endsWith(".com")) {
			return str.substring(0, str.length() - 4);
		} else return str;
	}

	static boolean isGMailAddress(String str) {
		if (str.indexOf("@") <= 0) return false;
		if (str.indexOf("@") != str.lastIndexOf("@")) return false;
		return str.endsWith("@gmail.com");
	}

	static void getCode() {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[3];

		for (int i = 0; i < 3; i++) {
			arr[i] = scan.nextLine();
		}

		String code = "";
		for (int i = 0; i < 3; i++) {
			int l = arr[i].indexOf(";");
			int r = arr[i].lastIndexOf(";");
			code += arr[i].substring(l + 1, r);
		}

		System.out.println(code);
	}

	static void sortStrings() {
		Scanner scan = new Scanner(System.in);
		String[] arr = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
		Arrays.sort(arr);
		for (String el : arr) System.out.println(el);
	}

	static void simpleReplace() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s.replace(";", ".,"));
	}
}
