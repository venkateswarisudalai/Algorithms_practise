package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 29, 4, 8,2,51,12,3};
        bubblesort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    private static int[] bubblesort(int[] A) {
        int temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
            }
        }

        return A;
    }

}
