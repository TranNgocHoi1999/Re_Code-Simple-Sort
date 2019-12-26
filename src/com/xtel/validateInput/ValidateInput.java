/*
 * This class use to validate Variable for all module  
 */
package com.xtel.validateInput;

import java.util.Scanner;
/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public class ValidateInput implements ValidateInteger{

    Scanner scanner;

    public ValidateInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int getPossitiveNumber() {
        String inputNumberypeString = "";
        int inputNumberTypeInt;
        while (true) {
            try {
                inputNumberypeString = scanner.nextLine().trim();
                inputNumberTypeInt = Integer.parseInt(inputNumberypeString);
                return inputNumberTypeInt;
            } catch (NumberFormatException e) {
                System.out.println("Exception input in variable : " + inputNumberypeString);
                System.out.println("Enter correct variable : ");
            }
        }
    }
    
    @Override
    // call this function when you want to get an integer in ranger 0 - your limit
    public int getPossitiveNumber(int maxLimit) {
        int inputNumberTypeInt;
        while (true) {
            inputNumberTypeInt = getPossitiveNumber();
            if (inputNumberTypeInt >= 0 && inputNumberTypeInt <= maxLimit) {
                return inputNumberTypeInt;
            }
            System.out.println("Exception !! . Input out of range ( 0, " + maxLimit + " ) .");
            System.out.println("Enter correct variable : ");
        }
    }

}
