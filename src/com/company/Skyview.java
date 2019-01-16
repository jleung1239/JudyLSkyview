package com.company;

public class Skyview {
    private double[][] view;
    public Skyview(int numRows, int numCols, double[] scanned){
        this.view = new double[numRows][numCols];
        int i = 0;
        int row = 0;
        int column = 0;
        while (row < view.length){
            if (column == 0){
                while (column < view[row].length){
                    view[row][column] = scanned[i];
                    column++;
                    i++;
                }
            }
            if (column-1 == view.length)
            {
                while (column > 0){
                    view[row][column] = scanned[i];
                    column--;
                    i++;
                }
            }
            row++;
            i++;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        //tba
    }

}
