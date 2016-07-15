package com.company.MyOwnPractice.game;

import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String>locationCalls;

    int numOfHits;
    int numOFGuest;

    public void setLocationCalls(ArrayList<String>loc) {
       locationCalls = loc;
    }

    public String checkYourSelf(String userInput){
        int ques = Integer.parseInt(userInput);

        String result = "Мимо";

        int index = locationCalls.indexOf(userInput);
        if (index >= 0){
            locationCalls.remove(index);
            if (locationCalls.isEmpty()){
                result = "Потомпил";
            }else {
                result = "Попал";
            }

        }
        return result;
    }

}

