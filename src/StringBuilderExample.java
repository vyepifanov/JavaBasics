import java.util.Scanner;

public class StringBuilderExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inp = scan.nextLine();

		int sum = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);

			if (Character.isDigit(c)) {
				int value = c - '0';
				sum += value;
				sb.append(value).append("+");
			}
		}

		if (sb.isEmpty()) {
			System.out.println("ERROR");
		} else {
			sb.replace(sb.length() - 1, sb.length(), "=");
			sb.append(sum);
			System.out.println(sb);
		}
	}

	static String primer(int a, int b) {
		StringBuilder sb = new StringBuilder(String.format("%d + %d = %d", a, b, a + b));
		return sb.toString();
	}

	static void rearrangeWords() {
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().trim().split(" +");
		StringBuilder sb = new StringBuilder(words[0]);

		for (int i = 1; i < words.length; i++) {
			char lastChar = sb.charAt(sb.length() - 1);
			for (int j = i; j < words.length; j++) {
				if (words[j].charAt(0) == lastChar) {
					sb.append(" ").append(words[j]);
					String tmp = words[j];
					words[j] = words[i];
					words[i] = tmp;
				}
			}
		}

		System.out.println(sb);
	}

	static void removeZ() {
		Scanner scan = new Scanner(System.in);
		String[] sent = scan.nextLine().trim().split(" +");
		StringBuilder sb = new StringBuilder(
				!sent[0].toLowerCase().contains("z") ? sent[0] : "ERROR");

		for (int i = 1; i < sent.length; i++) {
			if (!sent[i].toLowerCase().contains("z")) {
				sb.append(" ").append(sent[i]);
			} else sb.append(" ").append("ERROR");
		}

		System.out.printf("%s", sb);
	}
}
