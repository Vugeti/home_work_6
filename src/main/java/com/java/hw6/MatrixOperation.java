package com.java.hw6;

import java.util.Arrays;

public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiag[i] = matrix[i][i];
        }
        return mainDiag;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] coupDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            coupDiag[i] = matrix[i][matrix.length - 1 - i];
        }
        return coupDiag;
    }

    public int getMin(int[][] matrix) {
        int minNum = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                if (minNum > j) {
                    minNum = j;
                }
            }
        }return minNum;
    }

    public int getMax(int[][] matrix) {
        int maxNumber = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                if (maxNumber < j) {
                    maxNumber = j;
                }
            }
        }
        return maxNumber;
    }
}


