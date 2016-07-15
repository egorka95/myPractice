package com.company.MyOwnPractice.game;

/**
 * Created by nikitarozhkov on 13.07.16.
 */
public class runner {
    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();

        int numOFGuest = 0;

        GameHelper gameHelper = new GameHelper();

        int randomInt = (int) (Math.random()*5);

        int [] location = {randomInt,randomInt+1,randomInt+2};

        dotCom.setLocationCalls(location);

        boolean isAlive = true;

        while (isAlive == true){

            String ques = gameHelper.getUserInput("Введите число");
            String result = dotCom.checkYourSelf(ques);
            numOFGuest++;

            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOFGuest + " Попыток");
            }
        }
    }
}
