package by.itstep.timazay.examStage.task01.model.logic;

public class BestPeriodLogic {
    public static final int MARK_FOUR = 4;
    public static final int MARK_FIVE = 5;
    public static final int WEEK = 7;
    public static int findMaxNumberOfFives(int num, int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 2 || marks[i] > 5){
                return -1;
            }
        }
        int fives = 0;
        int currentFives = 0;
        int week = 0;
        int maxWeek = 0;
        boolean isValid = true;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < MARK_FOUR || marks[i] > MARK_FIVE) {
                isValid = false;
                week++;
            } else if (marks[i] == MARK_FIVE) {
                currentFives++;
                week++;
            } else {
                week++;
            }

            if (week == WEEK && isValid) {
                fives = Math.max(fives, currentFives);
                maxWeek += week;
                maxWeek++;
            } else if (week == WEEK && !isValid) {
                currentFives = 0;
                maxWeek += week;
                week = 0;
                isValid = true;
            }

        }

        if (maxWeek < marks.length){
            currentFives = 0;
            for (int i = 0; i < marks.length - maxWeek; i++) {
                if (marks[i] < MARK_FOUR || marks[i] > MARK_FIVE) {
                    break;
                } else if (marks[i] == MARK_FIVE) {
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
