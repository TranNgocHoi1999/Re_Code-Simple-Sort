/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.array;

import com.xtel.validateInput.ValidateInteger;

/**
 *
 * @author Administrator
 */
public class Array implements IArray{
    int numberOfIndex;
    ValidateInteger validate;
    int[] array;
    public Array(ValidateInteger validate) {
        System.out.print("Enter number of element : ");
        numberOfIndex = validate.getPossitiveNumber();
        this.validate = validate;
        array = new int[numberOfIndex];
    }

    @Override
    public int[] addArray() {
        for (int i = 0; i < numberOfIndex; i++) {
            System.out.print("Enter index "+ (i+1)+" : ");
            array[i] = validate.getPossitiveNumber();
        }
        return array;
    }
    

    @Override
    public void printAray() {
        for (int i = 0; i < numberOfIndex; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
}
