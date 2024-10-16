public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int sum = 0;
        int contribution = 15000;
        int total = 2_459_000;
        int month = 0;
        while (sum < total) {
            sum += contribution;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + "рублей");

        //Задание 2
        System.out.println("Задание 2");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 17; //на 1000
        int deathRate = 8; //на 1000
        int year = 10;
        int a = 1000;
        for (int i = 1; i <= year; i++) {
            population += (birthRate * population / a) - (deathRate * population / a);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //Задание 4
        System.out.println("Задание 4");
        int sum1 = 15000;
        int total1 = 12_000_000;
        int percent = 7;
        int month1 = 1;
        while (sum1 < total1) {
            sum1 += sum1 * percent / 100;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + sum1 + " рублей");
            month1++;
        }

        //Задание 5
        System.out.println("Задание 5");
        int sum2 = 15000;
        int total2 = 12_000_000;
        int percent2 = 7;
        int month2 = 1;
        while (sum2 < total2) {
            sum2 += sum2 * percent2 / 100;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + sum2 + " рублей");
            }
            month2++;
        }

        //Задание 6
        System.out.println("Задание 6");
        int sum3 = 15000;
        int percent3 = 7;
        int month3 = 1;
        int totalYear = 9;
        int year3 = 1;
        while (month3 <= totalYear * 12) {
            byte halfYear = 1;
            sum3 += sum3 * percent3 / 100;
            if (month3 % 12 == 0) {
                halfYear = 2;
            } else {
                halfYear = 1;
            }
            if (((month3 - 1) % 12 == 0) && (month3 != 1)) {
                year3++;
            }
            if (month3 % 6 == 0) {
                System.out.println("Год " + year3 + ", " + halfYear + " полугодие, сумма накоплений равна " + sum3 + " рублей");
            }
            month3++;
        }

        //Задание 7
        System.out.println("Задание 7");
        int friday = 4;
        for (int i = friday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        //Задание 8
        System.out.println("Задание 8");
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int period = 79; //лет
        for (int i = startYear; i <= endYear; i++) {
            if (i % period == 0) {
                System.out.println(i);
            }
        }
    }
}
