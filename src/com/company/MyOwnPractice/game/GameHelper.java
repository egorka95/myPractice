package com.company.MyOwnPractice.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nikitarozhkov on 14.07.16.
 */
public class GameHelper {

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            inputLine = is.readLine();
            if (inputLine.length() == 0)return null;
        }catch (IOException e){
            System.out.println(e);
        }
        return inputLine;
    }
}
