package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {

        String[][] array = {{"5", "7", "3", "17"}, {"7", "0", "1", "12"}, {"8", "1", "2", "3"}, {"8", "5", "4", "3"}};
        System.out.println(sumArray(array,4, 4 ));

        }

        public static int sumArray(String[][] array, int numberLines, int numberColumns) throws MyArraySizeException {
        int sum =0;
        if (array.length == numberLines){
            for (int i=0; i < array[i].length; i++) {
                System.out.println("i = " + i);
                if (array[i].length != numberColumns) {
                    throw new MyArraySizeException("Размер массива не соответсвует заданному размеру");
                }
                for (int j=0; j <= array[i].length; j++){
                    System.out.println("j = " + j);
                    System.out.println(sum);
                    sum += Integer.parseInt(array[i][j]);
                    }
                }
            }
        else {
            throw new MyArraySizeException("Размер массива не соответсвует заданному размеру");
        }
            return sum;
    }
}