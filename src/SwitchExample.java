import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		String monthName = switch (new Scanner(System.in).nextInt()) {
			case 1 -> "Январь";
			case 2 -> "Февраль";
			case 3 -> "Март";
			case 4 -> "Апрель";
			case 5 -> "Май";
			case 6 -> "Июнь";
			case 7 -> "Июль";
			case 8 -> "Август";
			case 9 -> "Сентябрь";
			case 10 -> "Октябрь";
			case 11 -> "Ноябрь";
			case 12 -> "Декабрь";
			default -> "Неверный номер месяца!";
		};
		System.out.println(monthName);
	}

	public static void translateDay() {
		boolean isCorrect = true;
		String englishDay = switch (new Scanner(System.in).next().toLowerCase()) {
			case "понедельник" -> "Monday";
			case "вторник" -> "Tuesday";
			case "среда" -> "Wednesday";
			case "четверг" -> "Thursday";
			case "пятница" -> "Friday";
			case "суббота" -> "Saturday";
			case "воскресенье" -> "Sunday";
			default -> {
				System.out.println("ERROR");
				isCorrect = false;
				yield "";
			}
		};

		if (isCorrect) System.out.println(englishDay);
	}

	public static void isWorkDay() {
		String day = switch (new Scanner(System.in).nextInt()) {
			case 1, 2, 3, 4, 5 -> "Working Day";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			default -> "ERROR";
		};
		System.out.println(day);
	}

	public static void getSalary() {
		Scanner scanner = new Scanner(System.in);

		int var = scanner.nextInt();
		switch (var) {
			case 1 -> {
				int dreamSalary = scanner.nextInt();
				int skipped = scanner.nextInt();
				System.out.println((dreamSalary + (skipped / 3) * 20) * 2);
			}
			case 2 -> {
				int code = scanner.nextInt();
				int dreamSalary = scanner.nextInt();
				if (code / 2 < dreamSalary) {
					System.out.println("ERROR");
				} else {
					System.out.println(((code / 100) * 50 - dreamSalary) / 20 * 3 + 2);
				}
			}
			case 3 -> {
				int code = scanner.nextInt();
				int skipped = scanner.nextInt();

				System.out.println(Math.max(0, (code / 100 * 50) - skipped / 3 * 20));
			}
			default -> System.out.println("ERROR");
		};
	}

	public static void getMonth() {
		System.out.println(switch (new Scanner(System.in).nextInt()) {
			case 12, 1, 2 -> "Winter";
			case 3, 4, 5 -> "Spring";
			case 6, 7, 8 -> "Summer";
			case 9, 10, 11 -> "Autumn";
			default -> "ERROR";
		});
	}
}
