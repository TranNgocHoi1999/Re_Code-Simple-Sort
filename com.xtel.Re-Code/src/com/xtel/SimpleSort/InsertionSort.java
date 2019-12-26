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
public class InsertionSort implements SimpleSort {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray.length <= 1 || inputArray == null) {
            return;
        }
        for (int i = 1; i < inputArray.length; i++) {
            for (int k = i; k >= 0; k--) {
                if (k == 0) {
                    break;
                } else if (inputArray[k] < inputArray[k - 1]) {
                    int swapVariable = inputArray[k];
                    inputArray[k] = inputArray[k - 1];
                    inputArray[k - 1] = swapVariable;
                } else {
                    break;
                }

            }

        }

    }

}
