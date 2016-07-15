package com.company.PracticeGOIT.StringBuilder;

/**
 * Created by nikitarozhkov on 26.06.16.
 */
public class PalindromWithStringBuilder {
    public static void main(String[] args) {
        String palindrom = "moom";

        //Преобразую строку к экземляру SringBuilder
        //Используя специальную конструкцию.
        StringBuilder builder = new StringBuilder(palindrom);

        //Позволяет изменить порядок символов на обратный.
        builder.reverse();

        if (palindrom.equals(builder.toString()))
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");
    }
}
