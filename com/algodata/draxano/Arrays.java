package com.algodata.draxano;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//Remember to analyse the time complexities
/*
* method avarageTemp()
* method daysAboveAvarageTemp()
* method missingNumber()
* method twoSum()
* method twoSum2()
* method twoSumCourse()
* */

public class Arrays {
    // you need to really understand the difference here
    // Array declaration, initialization, instantiation:
    int[][] exampleArray0;
    int[][] exampleArray1 = new int[3][3];
    int[][] exampleArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // When you run this method, the function asks from you to insert days, and then it asks from you to insert the
    // highest temperature which was recorded that day. Once you provide those details it returns an average of those days.
    // However, we can see that we're not really using Array Data structure here. This is where comes the second part of
    // the exercise. Which is basically to find the days above the average.
    public void averageTemp() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        int numDays = console.nextInt();
        int sum = 0;
        for (int i = 1; i <= numDays; i++) {
            System.out.print("Day " + i + "'s high temp");
            int next = console.nextInt();
            sum += next;
        }

        double average = sum / numDays;
        System.out.println();
        System.out.println("Average Temp = " + average);

    }

    // This is the second part of the exercise where we're actually using the Array data structure to help us accomplish
    // our task.

    public void daysAboveAverageTemp() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        int numDays = console.nextInt();
        // record temperatures and find average
        int[] temps = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double average = sum / numDays;

        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
            }
        }

        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + "days above the average");

    }

    // int intArray[] ={1-100 including 100, but 1 number is missing, so there is 99 elements}
    // this method only checks for 100 elements so from 1-100, if there needs to be an adjustment made
    // to the limit of the arrays whe should change the n variable to which will be equaled to the last number in the array.

    public void missingNUmber(int[] intArray) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : intArray) {
            sum1 += i;
        }
        sum2 = 10 * (10 + 1) / 2;  //this complies with the equation of 1,2,3,4...n = n(n+1)/2. Remember that n is the amount of numbers which you have in the array.
        int difference = sum1 - sum2;
        System.out.println("Missing Number is " + difference);

    }
// Problem with the algo:
    // 1. Double loop is O(N^2) which is not the greatest solution.

    public void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums.length; i++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    System.out.println("The values which satisfy the target are: " + nums[i] + " and " + nums[j]);
                }

            }

        }
    }

    public void twoSum2(int[] nums, int target) {
        boolean succeed;
        for (int counter = 0; counter < nums.length - 1; counter++) {
            if (nums[counter] + nums[counter + 1] == target) {
                succeed = true;
                System.out.println("The pair which you're looking for is: " + (counter) + ", " + (counter + 1));
                break;
            }
        }

    }

// You came with two great solutions, but a better one would be:

    public int[] twoSumCourse(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // this is an anonymous object
                }
            }
        }

        throw new IllegalArgumentException("No solution found"); // this is anonymous object as well
    }


   public void rotate90deg(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j >= 0 ; j--){
                System.out.print(arr[j][i] + " ");

            }
            System.out.println();


        }

   }



   }


