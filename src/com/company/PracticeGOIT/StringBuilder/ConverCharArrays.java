package com.company.PracticeGOIT.StringBuilder;

/**
 * Created by nikitarozhkov on 24.06.16.
 */
public class ConverCharArrays {
    public static void main(String[] args) {
        char[] chatArrayToString = {'a','b','c','d'};

        //Тут мы преобразуем елементы Char в String.
        StringBuilder builder = new StringBuilder();

        for (char value : chatArrayToString){
            builder.append(value);

        }
        //Выводим уже строку в формате String.
        System.out.println(builder.toString());
    }
}
