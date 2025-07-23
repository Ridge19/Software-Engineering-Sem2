package com.mycompany.app;

class BubbleSort2 {
    static void BubbleSort2(int arr[]) {
        int i, j, temp;
        boolean swapped;

        int n = arr.length;

        // if array is empty, nothing to sort. 
        if (n == 0) {
            System.out.println("Array is empty, nothing to sort.");
            return;
        }

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    static void printArray(int arr[], int size) {
        int i;

        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {70,61,72,83,38};
        int arr2[] = {7,2,76,4,99};
        int arr3[] = {28,9,13,78,19};
        int arr4[] = {68,84,41,62,18};
        int arr5[] = {37,57,40,13,50};

        System.out.println("Unsorted array:");
        printArray(arr1, arr1.length);
        printArray(arr2, arr2.length);
        printArray(arr3, arr3.length);
        printArray(arr4, arr4.length);
        printArray(arr5, arr5.length);

        System.out.println("Sorting arrays using Bubble Sort...");
        BubbleSort2(arr1);
        BubbleSort2(arr2);
        BubbleSort2(arr3);
        BubbleSort2(arr4);
        BubbleSort2(arr5);

        System.out.println("Sorted array:");
        printArray(arr1, arr1.length);
        printArray(arr2, arr2.length);
        printArray(arr3, arr3.length);
        printArray(arr4, arr4.length);
        printArray(arr5, arr5.length);
    }


}
