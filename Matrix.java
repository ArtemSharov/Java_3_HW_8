package ru.gb.java_3.hw_8;

/*
1 Задать размерность матрицы от 5 до 7
2 Создать матрицу с указанной размерностью
3 Заполнить матрицу по спирали (числа увеличиваются на 1) (число начинается с 1)
 */

public class Matrix {
    public static void main(String[] args) {
        int lines = 5;
        int columns = 7;
        int a = 1;
        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = a;
                a++;
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println();
        }
    }
}
