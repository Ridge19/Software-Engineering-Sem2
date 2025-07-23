package com.mycompany.app;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        String[] arr = {"1", "5", "7", "9", "3", "5", "6", "2", "4", "8"};
        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is empty, nothing to sort.");
            return;
        }    

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("Swapped: " + arr[j] + " and " + arr[j + 1]);
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public class Int {
        String[] arr;

        public Int(String[] arr) {
            this.arr = arr;
        }

        public String[] getArr() {
            return arr;
        }

        public void setArr(String[] arr) {
            this.arr = arr;
        }

        @Override
        public String toString() {
            return "Int{" +
                    "arr=" + Arrays.toString(arr) +
                    '}';
        }
    }

    
}
