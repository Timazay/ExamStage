package by.itstep.timazay.examStage.task01.model.logic;

public class BestPeriodLogic {
    public static int findMaxNumberOfFives(int num, int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks.length != num || marks[i] < 2 || marks[i] > 5){
                return -1;
            }
        }
        int fives = 0;
        int currentFives = 0;
        int week = 0;
        int maxWeek = 0;
        boolean isValid = true;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 4 || marks[i] > 5) {
                isValid = false;
                week++;
            } else if (marks[i] == 5) {
                currentFives++;
                week++;
            } else {
                week++;
            }

            if (week == 7 && isValid) {
                fives = Math.max(fives, currentFives);
                maxWeek += week;
                maxWeek++;
            } else if (week == 7 && !isValid) {
                currentFives = 0;
                maxWeek += week;
                week = 0;
                isValid = true;
            }
        }

        if (maxWeek < marks.length){
            currentFives = 0;
            for (int i = 0; i < marks.length - maxWeek; i++) {
                if (marks[i] < 4 || marks[i] > 5) {
                    break;
                } else if (marks[i] == 5) {
                    currentFives++;
                }
            }
        }

        fives = Math.max(currentFives, fives);

        if (fives == 0) {
            fives = -1;
        }

        return fives;
    }
}