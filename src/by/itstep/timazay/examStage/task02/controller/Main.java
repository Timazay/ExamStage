package by.itstep.timazay.examStage.task02.controller;

import by.itstep.timazay.examStage.task02.model.logic.ImageLogic;


public class Main {
   public static void main(String[] args) {
       int[][] matrix = {
               {1,2,3},
               {4,5,6}
       };

       char r = 'R';

      int[][] result = ImageLogic.rotateImage(matrix,r);


       for (int i = 0; i < matrix[0].length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               System.out.print(result[i][j] + " ");
           }
           System.out.println();
       }

   }
}
