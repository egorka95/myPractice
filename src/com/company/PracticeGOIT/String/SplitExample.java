package com.company.PracticeGOIT.String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nikitarozhkov on 24.06.16.
 */
public class SplitExample {
    public static void main(String[] args) {
        System.out.println("Enter numbers using cama delimeter");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        //что за магия здесь начинает происходить??

        String[] splitSringArray = inputString.split(",");//что именно происходит в это строке
        int [] intArrays = new int[splitSringArray.length];

        for (int i = 0; i < splitSringArray.length; i++)
            intArrays[i] = Integer.valueOf(splitSringArray[i]);

        System.out.println(Arrays.toString(splitSringArray)
        .replace("[","")      //что значит replace?
        .replace("]",""));    //и почему тут записаны именно эти значения?

    }
}
