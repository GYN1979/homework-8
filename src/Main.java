public class Main {
    public static void main(String[] args) {

        // Task 1.1.
        System.out.println("Task 1.1.");
        int month1 = 0;
        int savings = 0;
        while (savings < 2_459_000) {
            savings = savings + 15000;
            month1 = month1 + 1;
            System.out.println(" Месяц " + month1 + ", сумма накоплений равна " + savings + " рублей");
        }
        // Task 1.2.
        System.out.println("Task 1.2.");
        int b = 1;
        while (b <= 10) {
            System.out.print(b);
            b++;
        }
        System.out.println();

        for (int h = 10; h > 0; h--) {
            System.out.print(h);
        }
        System.out.println();

        // Task 1.3.
        System.out.println("Task 1.3.");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthYear = 17;
            int mortalityYear =  8;
            int difference = birthYear - mortalityYear;
            population = population + population / 1000 * difference;
            System.out.println (" Год " + year + " численность " + population);
        }
        // Task 2.1.
        System.out.println("Task 2.1.");
        double savings1 = 15000;
        int month = 0;
        while (savings1 <= 12_000_000) {
            month++;
            savings1 *= 1.07;
            System.out.println(" Месяц " + month + " сумма накоплений " + savings1);
        }
        // Task 2.2.
        System.out.println("Task 2.2.");
        double savings2 = 15000;
        int month2 = 0;
        while (savings2 <= 12_000_000) {
            savings2 *= 1.07;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(" Месяц " + month2 + " сумма накоплений " + savings2);
            }
        }
        // Task 2.3.
        System.out.println("Task 2.3.");
        double savings3 = 15000;
        int month5 = 0;
        while (savings3 <= 12_000_000) {
            savings3 *= 1.07;
            month5++;
            if (month5 % 6 == 0) {
                System.out.println(" Месяц " + month5 + " сумма накоплений " + savings3);
            }
        }
        // Task 2.4.
        System.out.println("Task 2.4.");
        for ( int reportingFriday = 5; reportingFriday <=31; reportingFriday += 7){
            System.out.println (" Сегодня пятница, " + reportingFriday + " -ое число. Необходимо подготовить отчет ");
        }
        // Task 3.1.
        System.out.println("Task 3.1");
        int currenYear = 2022;
        int previousYear = currenYear - 200;
        int nextYear = currenYear + 100;
        for (int c = previousYear; c <= nextYear; c++) {
            if (c % 79 == 0) {
                System.out.println(c);
            }
        }
        // Task3.2.
        System.out.println("Task 3.2");
        int a = 2;
        for (b = 1; b <= 10; b++) {
            int k = a * b;
            System.out.println(a + " * " + b + " = " + k);
        }

    }
}








