package org.example;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = { { "5", "7", "3", "17" }, { "7", "0", "1", "12" }, { "8", "1", "2", "3" },
                { "8", "5", "4", "3" } };

        try {
            System.out.println("Сумма элементов массива равна " + sumArray1(array, 4, 4));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println("Не удалось выполнить расчет");
            e.printStackTrace();
        }
    }

    public static int sumArray1(String[][] array, int numberLines, int numberColumns) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if (array.length == numberLines) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length == numberColumns) {
                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            sum += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Данные в строке " + (i + 1) + " столбце " + (j+1) + " неудалось преобразовать к числовому значению");
                        }
                    }
                } else {
                    throw new MyArraySizeException("Количество столбцов в " + (i + 1) + " строке не равно " + numberColumns);
                }
            }
        } else {
            throw new MyArraySizeException("Количество строк в массиве не равно " + numberLines);
        }
        return sum;
    }
}