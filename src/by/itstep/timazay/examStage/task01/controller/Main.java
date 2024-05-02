package by.itstep.timazay.examStage.task01.controller;

import by.itstep.timazay.examStage.task01.model.logic.BestPeriodLogic;

public class Main {
    public static void main(String[] args) {
        System.out.println(BestPeriodLogic.findMaxNumberOfFives(14,new int[] {5,5,4,5,5,5,4,5,4,4,4,4,5,5}));
    }
}
