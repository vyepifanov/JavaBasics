import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        // simpleOutput();
        // inputTwoNumbers();
        complexInput();
    }

    public static void simpleOutput() {
        String name = "Андрей";
        int age = 23;
        double discount = 15.5;

        System.out.printf("С Днем Рождения, %s!%n", name);
        System.out.printf("Сегодня Вам %d!%n", age);
        System.out.printf("По этому поводу Вам скидка %.1f%%%n", discount);
        System.out.println("на весь ассортимент нашего сайта!");
    }

    public static void inputTwoNumbers() {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a + b);
    }

    public static void complexInput() {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = scan.nextInt();
        double discount = scan.nextDouble();

        System.out.printf("С Днем Рождения, %s! Сегодня Вам %d!%n", name, age);
        System.out.printf("По этому поводу Вам скидка %.1f%%%n", discount);
        System.out.println("на весь ассортимент нашего сайта!");
    }

    public static void calcRubles() {
        Scanner scan = new Scanner(System.in);

        int mainPart = scan.nextInt();
        int secPart = scan.nextInt();

        mainPart += secPart / 100;
        secPart %= 100;

        System.out.printf("%d р. %d к.", mainPart, secPart);
    }

    public static void getDiff() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max_a_b = a > b ? a : b;
        int total_max = max_a_b > c ? max_a_b : c;

        int min_a_b = a < b ? a : b;
        int total_min = min_a_b < c ? min_a_b : c;

        System.out.printf("%d", total_max - total_min);
    }

    public static void getTime() {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int hours = total / (60 * 60);
        int minutes = total % (60 * 60) / 60;
        int seconds = total - hours * 60 * 60 - minutes * 60;

        System.out.printf("%d часов %d минут %d секунд", hours, minutes, seconds);
    }

    public static void saleValue() {
        Scanner scanner = new Scanner(System.in);

        int rub = scanner.nextInt();
        int kop = scanner.nextInt();
        int sale = scanner.nextInt();

        int price = ((rub * 100 + kop) * (100 - sale) + 99) / 100;
        System.out.printf("%d руб. %02d коп.", price / 100, price % 100);
    }

    public static void getFuncValue() {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double z = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * x), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * x), 2);
        double y = 0.25 - Math.sin(5 * Math.PI / 2 - 8 * x);

        System.out.printf("%.5f %.5f", z, y);
    }
}
