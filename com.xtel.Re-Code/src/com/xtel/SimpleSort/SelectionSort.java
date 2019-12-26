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
public class SelectionSort implements SimpleSort {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray.length <= 1 || inputArray == null) {
            return;
        }
        for (int i = inputArray.length - 1; i >= 0; i--) {
            int IndexOfMaxVariableInArray = i;
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[IndexOfMaxVariableInArray]) {
                    IndexOfMaxVariableInArray = j;
                }
            }
            int swapVariable = inputArray[i];
            inputArray[i] = inputArray[IndexOfMaxVariableInArray];
            inputArray[IndexOfMaxVariableInArray] = swapVariable;
        }
    }

}
