public class Main {
    public static void main(String[] args) {

        // Task 1.1.
        System.out.println("Task 1.1.");
        int i = 0;
        int total = 0;
        while (total < 2_459_000) {
            total = total + 15000;
            i = i + 1;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        // Task 1.2.
        System.out.println("Task 1.2.");
        int b = 1;
        while (b <= 10) {
            if (b == 10) {
                System.out.println(b);
                break;
            }
            System.out.print(b);
            b++;
        }
        for (int h = 10; h > 0; h--) {
            System.out.print(h);
        }
        System.out.println();

        // Task 1.3.
        System.out.println("Task 1.3.");
        int population = 12_000_000;
        int birthYear = population / 1000 * 17;
        int mortalityYear = population / 1000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birthYear - mortalityYear;
            System.out.println(" Год " + year + ", численность населения составляет " + population + " человек");
        }
        // Task 2.1.
        System.out.println("Task 2.1.");
        double total1 = 15000;
        int month = 0;
        while (total1 <= 12_000_000) {
            month++;
            total1 *= 1.07;
            System.out.println(" Месяц " + month + " сумма накоплений " + total1);
        }
        // Task 2.2.
        System.out.println("Task 2.2.");
        double total2 = 15000;
        int month2 = 0;
        while (total2 <= 12_000_000) {
            total2 *= 1.07;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(" Месяц " + month2 + " сумма накоплений " + total2);
            }
        }
        // Task 2.3.
        System.out.println("Task 2.3.");
        double total5 = 15000;
        int month5 = 0;
        while (total5 <= 12_000_000) {
            total5 *= 1.07;
            month5++;
            if (month5 % 6 == 0) {
                System.out.println(" Месяц " + month5 + " сумма накоплений " + total5);
            }
        }
        // Task 2.4.
        System.out.println("Task 2.4.");
        int firstFriday = 5;
        int nextFriday = 0;
        for (nextFriday = firstFriday; nextFriday < 31; nextFriday += 7) {
            System.out.println(" Сегодня пятница, " + nextFriday + " -ое число. Необходимо подготовить отчет ");
        }
        // Task 3.1.
        System.out.println("Task 3.1");
        int currenYear = 2022;
        int previousYear = currenYear - 200;
        int nextYear = currenYear + 100;
        for (int c = previousYear; c < nextYear; c++) {
            if (c % 79 == 0) {
            System.out.println(c);
            }
        }
        // Task3.2.
        System.out.println("Task 3.2");
        int a = 2;
        for (b = 1; b <=10; b++){
        int k = a * b;
        System.out.println(a + " * " + b + " = " + k);
        }
        }
}




