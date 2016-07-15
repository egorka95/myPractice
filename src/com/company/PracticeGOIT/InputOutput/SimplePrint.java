package com.company.PracticeGOIT.InputOutput;

/**
 * Created by nikitarozhkov on 29.06.16.
 */
public class SimplePrint {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.print("The square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.println(".");


        i = 5;
        r = Math.sqrt(i);

        final StringBuilder stringBuilder = new StringBuilder("The square root of ");
        stringBuilder.append(i)
                .append(" is ")
                .append(r)
                .append(".");

        final String outPautMassage = stringBuilder.toString();
        System.out.println(outPautMassage);
    }
}
