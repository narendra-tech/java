package com.haritech.service.Mar23;

public class Test {
    //arrays.
    public static void main(String args[]){
        int[] arr1 = {10,20,30};
        //try for float, boolean, string.
        //insert/add even numbers between 10 - 20 into array.

        int[] arr2 = new int[2];
        int arr3[] = new int[3];
        int []arr4 = new int[4];

        int[][] arr5 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr5[0][2]);

        int[][] arr6 = new int[3][3];
        System.out.println(arr6[0][2]);
        arr6[0][0] = 10;
        arr6[0][1] = 20;
        arr6[0][2] = 30;

        int[] arr7[] = {};
        int arr8[][] = {};
        int[] []arr9 = {};

        //jagged array.
        int[][] arr10 = new int[2][];
        arr10[0] = new int[4];
        arr10[1] = new int[3];
        arr10[0][0] = 10;
        arr10[0][1] = 20;
        arr10[0][2] = 30;
        arr10[0][3] = 40;

        arr10[1][0] = 50;
        arr10[1][1] = 60;
        arr10[1][2] = 70;

        System.out.println("data is::"+arr10[0][3]);

        //insert the data into 2 -dimenstion array using for loop.


        int a = 10;
        for(int i =0; i< arr2.length; i++){
            arr2[i] = a;
            a++;
        }

        for(int i =0; i< arr2.length; i++){
//            System.out.println(arr2[i]);
        }


        int[] arr = {};
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;

    }
}
