package by.itstep.timazay.examStage.task02.controller;

import by.itstep.timazay.examStage.task02.model.logic.ImageLogic;


public class Main {
   public static void main(String[] args) {
       int[][] matrix = {
               {1,2,3},
               {4,5,6}
       };

      int[][] result = ImageLogic.rotateImageLeft(matrix);
      int[][] result2 = ImageLogic.rotateImageRight(matrix);

       for (int i = 0; i < matrix[0].length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               System.out.print(result[i][j] + " ");
           }
           System.out.println();
       }

       for (int i = 0; i < matrix[0].length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               System.out.print(result2[i][j] + " ");
           }
           System.out.println();
       }
   }
}
