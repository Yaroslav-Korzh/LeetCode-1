package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15, 2, 7};
        int target = 9;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + " " + j);
                array[i] += 100;
                array[j] += 100;
                }
            }
            i++;
        }
    }
}