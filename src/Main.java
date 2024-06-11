public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        double total = 0;
        double deposit = 15000;
        double percentPerMonth = 1.01;
        int month = 1;
        while (total <= 2459000) {
            total += deposit;
            total *= percentPerMonth;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей %n", month, total);
            month++;
        }
        System.out.println();

        System.out.println("Task2");
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();

        System.out.println("Task3");
        int fertility;
        int mortality;
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            fertility = population / 1000 * 17;
            mortality = population / 1000 * 8;
            population += fertility - mortality;
            System.out.printf("Год %s, численность населения составляет %s%n", year, population);
        }
        System.out.println();

        System.out.println("Task4-5");
        double vasyaPercent = 1.07;
        double vasyaDeposite = 15000;
        int vasyaMonth = 1;
        while (vasyaDeposite < 12_000_000) {
            vasyaDeposite *= vasyaPercent;
            if (vasyaMonth % 6 == 0) {
                System.out.printf("Месяц: %s, сумма накоплений: %.2f %n", vasyaMonth, vasyaDeposite);
            }
            vasyaMonth++;
        }
        System.out.println();

        System.out.println("Task6");
        vasyaPercent = 1.07;
        vasyaDeposite = 15000;
        int monthsAmount = 9 * 12;
        for (int i = 1; i <= monthsAmount; i++) {
            vasyaDeposite *= vasyaPercent;
            if (i % 6 == 0) {
                System.out.printf("Месяц: %s, сумма накоплений: %.2f %n", i, vasyaDeposite);
            }
        }
        System.out.println();

        System.out.println("Task7");
        int friday = 7;
        int iterCounter = 0;
        while (friday <= 31) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет %n", friday);
            friday += 7;
            iterCounter++;
        }
        System.out.println("Количество интераци: " + iterCounter);
        System.out.println();

        System.out.println("Task8");
        int period = 79;
        int currentYear = 2024;
        int lowerBoarder = currentYear - 200;
        int upperBoarder = currentYear + 100;
        for (int i = lowerBoarder; i < upperBoarder; i++) {
            if (i % period == 0) {
                System.out.println(i);
            }
        }
    }
}
