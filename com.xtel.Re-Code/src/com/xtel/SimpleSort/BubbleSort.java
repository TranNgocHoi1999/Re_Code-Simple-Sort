/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.SimpleSort;

/**
 *
 * @author Administrator
 */
public class BubbleSort implements SimpleSort {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray.length <= 1 || inputArray == null) {
            return;
        }
        int maxNumberInArray = inputArray[0];
        for (int j = inputArray.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (inputArray[i + 1] < inputArray[i]) {
                    int swapVariable = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = swapVariable;
                }
                if (inputArray[i] > maxNumberInArray) {
                    maxNumberInArray = inputArray[i];
                }

            }
        }

    }

}
