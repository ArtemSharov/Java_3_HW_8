package ru.gb.java_3.hw_8;

public class SpiralMatrix {

        public static void main(String[] args) {

            int lines = 5;
            int columns = 7; 
            int s = 1;
            int[][] matrix = new int[lines][columns];


            for (int y = 0; y < columns; y++) {
                matrix[0][y] = s;
                s++;
            }
            for (int x = 1; x < lines; x++) {
                matrix[x][columns - 1] = s;
                s++;
            }
            for (int y = columns - 2; y >= 0; y--) {
                matrix[lines - 1][y] = s;
                s++;
            }
            for (int x = lines - 2; x > 0; x--) {
                matrix[x][0] = s;
                s++;
            }

            int c = 1;
            int d = 1;

            while (s < lines * columns) {

                while (matrix[c][d + 1] == 0) {
                    matrix[c][d] = s;
                    s++;
                    d++;
                }
                while (matrix[c + 1][d] == 0) {
                    matrix[c][d] = s;
                    s++;
                    c++;
                }
                while (matrix[c][d - 1] == 0) {
                    matrix[c][d] = s;
                    s++;
                    d--;
                }
                while (matrix[c - 1][d] == 0) {
                    matrix[c][d] = s;
                    s++;
                    c--;
                }
            }

            for (int x = 0; x < lines; x++) {
                for (int y = 0; y < columns; y++) {
                    if (matrix[x][y] == 0) {
                        matrix[x][y] = s;
                    }
                }
            }


            for (int x = 0; x < lines; x++) {
                for (int y = 0; y < columns; y++) {
                    System.out.print(" [ " + matrix[x][y] + " ] ");
                }
                System.out.println("");
            }
        }
    }
