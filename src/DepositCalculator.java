import java.util.Scanner;

public class DepositCalculator {

    double calculateComplexPercent(double Amount, double YearRate, int depositPeriod) {
        double pay = Amount * Math.pow((1 + YearRate / 12), 12 * depositPeriod);
            return round(pay, 2);
}

    double сalculateSimplePercent(double Amount, double YearRate, int depositPeriod) {
        return round(Amount + Amount * YearRate * depositPeriod, 2);
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
            finalAmount = сalculateSimplePercent(amount, 0.06, depositPeriod);
        } else if (userInput == 2) {
            finalAmount = calculateComplexPercent(amount, 0.06, depositPeriod);
        }
        System.out.println("Результат вклада: " + amount + " за " + depositPeriod + " лет превратятся в " + finalAmount);
    }

    public static void main(String[] args) {
        DepositCalculator calculator = new DepositCalculator();
        calculator.calculateDepositInfo();
}

}
