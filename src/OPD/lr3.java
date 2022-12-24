package OPD;

import java.util.Scanner;

public class lr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время прошедшее с начала проекта(мес.):");
        float checkPoint = in.nextFloat();
        System.out.println("Введите бюджет проекта (у.е.):");
        float budget = in.nextFloat();
        System.out.println("Введите текущие затраты (у.е.):");
        float currentExpenses = in.nextFloat();
        System.out.println("Введите запланированые сроки (мес):");
        float plannedTerm = in.nextFloat();
        System.out.println("Введите процент выполненных работ:");
        float readyNow = in.nextFloat();
        calculateDelay(checkPoint, budget,currentExpenses,plannedTerm, readyNow);
    }
    public static void calculateDelay(float checkPoint, float budget,
                                      float currentExpenses, float plannedTerm, float readyNow) {
        float labor = 100;
        float estimatedEndpoint = (checkPoint * labor)/readyNow;
        float termShift = estimatedEndpoint - plannedTerm;
        float estimatedBudget =
                (estimatedEndpoint * currentExpenses)/checkPoint;
        float expensesShift = estimatedBudget - budget;
        System.out.println("Задержка сроков: " + termShift + " мес.");
        System.out.println("Перерасход бюджета: " + expensesShift + " у.е.");
    }

}
