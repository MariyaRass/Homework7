public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int desiredSum = 2459000;
        int deposit = 15000;
        double sum = 0;
        int month = 0;
        while (sum <= desiredSum) {
            month++;
            sum += deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("Задание 2");
        int number = 0;
        while (number <= 9) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println("Задание 3");
        int totalNumber = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 10;
        int currentYear = 2024;
        for (int year = currentYear + 1; year <= currentYear + years; year++) {
            totalNumber += (birthRate - mortalityRate) * totalNumber / 1000;
            System.out.println("Год " + year + " численность населения составляет " + totalNumber);
        }

        System.out.println("Задание 4");
        double percent = 7 / 100D;
        sum = deposit;
        month = 0;
        while (sum < desiredSum) {
            month++;
            sum += sum * percent;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println("Задание 5");
        sum = deposit;
        month = 0;
        while (sum < desiredSum) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей.");
            }
        }

        System.out.println("Задание 6");
        sum = deposit;
        month = 0;
        int months = 9 * 12;
        while (month < months) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей.");
            }
        }
        System.out.println("Задание 7");
        int firstFriday = 2;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет");

        }
        System.out.println("Задание 8");
        int i =2024;
        int startYear=currentYear-200;
        int endYear=currentYear+100;
        int period=79;
        int startPeriod=0;
        for (int year = startPeriod; year <=endYear ; year+=period) {
            if(year>=startYear){
                System.out.println (year);
            }

        }


    }
}