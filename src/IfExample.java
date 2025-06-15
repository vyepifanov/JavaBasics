import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void minDot() {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double dist1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double dist2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (dist1 < dist2) {
            System.out.println("Первая точка ближе");
        } else if (dist1 > dist2) {
            System.out.println("Вторая точка ближе");
        } else {
            System.out.println("Точки на равных расстояниях");
        }
    }

    public static void getOddNumbersSum() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number < 0) number = -number;
        if (number < 100 || number > 999) { //неверные исходные данные
            System.out.println("ERROR");
            return; //прекращение работы программы
        }

        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;

        int result = 0;
        if (a % 2 != 0) result += a;
        if (b % 2 != 0) result += b;
        if (c % 2 != 0) result += c;

        System.out.printf("%d", result);
    }

    public static void isLucky() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if ((num < 100_000) | (num > 999_999)) {
            System.out.println("ERROR");
            return;
        }

        int lPart = num / 1000;
        int rPart = num % 1000;
        int lValue = lPart / 100 + lPart / 10 % 10 + lPart % 10;
        int rValue = rPart / 100 + rPart / 10 % 10 + rPart % 10;

        System.out.println(lValue == rValue ? "YES" : "NO");
    }

    public static void getMaxMean() {
        Scanner scanner = new Scanner(System.in);
        int t1_1 = scanner.nextInt();
        int t1_2 = scanner.nextInt();
        int t2_1 = scanner.nextInt();
        int t2_2 = scanner.nextInt();
        int t2_3 = scanner.nextInt();
        int t2_4 = scanner.nextInt();

        float mean1 = (float)(t1_1 + t1_2) / 2;
        float mean2 = (float)(t2_1 + t2_2 + t2_3 + t2_4) / 4;

        if (mean1 > mean2) {
            System.out.println("First");
        } else if (mean1 < mean2) {
            System.out.println("Second");
        } else {
            System.out.println("Draw");
        }
    }

    public static void getMin() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num < min) min = num;
        }

        System.out.println(min);
    }

    public static void getSalary() {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        double perHour = scanner.nextDouble();

        if (hours < 0 || perHour < 0) {
            System.out.println("ERROR");
            return;
        }

        double salary = hours * perHour;
        salary += Math.max(hours - 20, 0) * perHour / 2;
        salary += Math.max(hours - 40, 0) * perHour / 2;

        System.out.printf("%.2f", salary);
    }

    public static void getFuel() {
        Scanner scanner = new Scanner(System.in);
        final int MAX_FUEL = 300;
        int AB = scanner.nextInt();
        int BC = scanner.nextInt();
        int w = scanner.nextInt();

        if (w > 2000) {
            System.out.println("ERROR");
            return;
        }
        int perKM = 1;
        if (w > 500 & w <= 1000) {
            perKM = 4;
        } else if (w > 1000 & w <= 1500) {
            perKM = 7;
        } else if (w > 1500) {
            perKM = 9;
        }

        if (AB * perKM > MAX_FUEL | BC * perKM > MAX_FUEL) {
            System.out.println("ERROR");
            return;
        }

        System.out.printf("%.2f", (float)Math.max(0, BC * perKM - (MAX_FUEL - AB * perKM)));
    }

    public static void drawLine() {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int num = scanner.nextInt();
        char symbol = scanner.next().charAt(0);

        if (num < 0 || (type != 1 && type != 2)) {
            System.out.println("ERROR");
            return;
        }

        if (type == 1) {
            for (int i = 0; i < num; i++) {
                System.out.println(symbol);
            }
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(symbol);
            }
        }
    }
}
