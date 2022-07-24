import java.util.Scanner;

public class CalculateDeposit {

    double calculateComplexPercent(double doubleAmount, double doubleYearRate, int depositPeriod) {
        double pay = doubleAmount * Math.pow((1 + doubleYearRate / 12), 12 * depositPeriod);
            return round(pay, 2);
}

    double CalculateSimplePercent(double doubleAmount, double doubleYearRate, int depositPeriod) {
        return round(doubleAmount + doubleAmount * doubleYearRate * depositPeriod, 2);
    }

    double round(double value,int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
}

    void calculateDepositInfo() {
        int depositPeriod;
        int userInput;

        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
            System.out.println("Введите срок вклада в годах:");
        depositPeriod = scanner.nextInt();
            System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        userInput = scanner.nextInt();
        double finalAmount = 0;
        if (userInput == 1) {
            finalAmount = CalculateSimplePercent(amount, 0.06, depositPeriod);
        } else if (userInput == 2) {
            finalAmount = calculateComplexPercent(amount, 0.06, depositPeriod);
        }
        System.out.println("Результат вклада: " + amount + " за " + depositPeriod + " лет превратятся в " + finalAmount);
    }

    public static void main(String[] args) {
        new CalculateDeposit().calculateDepositInfo();
}

}
