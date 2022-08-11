package com.algodata.draxano;

public class main {
    public static void main(String args[]){

        int[] arrayexample = {8, 4, 3, 4, 9, 0, 6, 3, 5};
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] arr = {1,2,3,4,5};


        Arrays one = new Arrays();

        // this eventually solves half of the problem

        System.out.println( matrix[2][0] + " " + matrix[1][0] + " " + matrix[0][0]);
        System.out.println( matrix[2][1] + " " + matrix[1][1] + " " + matrix[0][1]);
        System.out.print(   matrix[2][2] + " " + matrix[1][2] + " " + matrix[0][2]);
        System.out.println();
        System.out.println();
        one.rotate90deg(matrix);


    }
}


