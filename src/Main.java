public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");
        int[] expenditure = {17200, 13600, 14900, 27300, 19100};
        int totalExpenditure = 0;
        for (int i : expenditure) {
            totalExpenditure += i;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", totalExpenditure);

        System.out.println("\nЗадание 2\n");
        int[] credit = {1458, 7300, 0, 3600, 2175};
        int maxCredit = -1;
        int minCredit = 1_000_000_000;
        for (int j : credit) {
            if (j < minCredit) {
                minCredit = j;
            }
            if (j > maxCredit) {
                maxCredit = j;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей\n", minCredit);
        System.out.printf("Максимальная сумма трат за неделю составила %s рублей\n", maxCredit);

        System.out.println("\nЗадание 3\n");
        int[] expenditure2 = {17200, 13600, 16903, 27300, 19100};
        double totalExpenditureMonth = 0;
        for (int i : expenditure2) {
            totalExpenditureMonth += i;
        }
        double averageWeekExp = totalExpenditureMonth / expenditure2.length;
        System.out.printf("Средняя сумма еженедельных трат за месяц составила %s рублей\n", averageWeekExp);

        System.out.println("\nЗадание 4\n");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }

    }
}
