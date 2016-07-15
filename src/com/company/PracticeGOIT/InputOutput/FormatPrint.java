package com.company.PracticeGOIT.InputOutput;

/**
 * Created by nikitarozhkov on 29.06.16.
 */
public class FormatPrint {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d, %f ,%n",i,r);
    }
}
