package com.company.MyOwnPractice.TextGame;

import java.util.Scanner;

/**
 * Created by nikitarozhkov on 02.07.16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("И так давай с тобой начнем небольшой опрос");
        System.out.println("Ты готов?Ответь да или нет.");
        Scanner scanner = new Scanner(System.in);
        String answer1;
        answer1 = scanner.nextLine();

        if (answer1.equals("да")) {
            System.out.println("ну что ж, поехали");
        }
        if (!answer1.equals("да")) {
            System.out.println("Тогда в другой раз");

        }
        //Как сделать так что б если ответили не "да" програма выключалась?

        System.out.println("Теперь скажи как тебя зовут");
        String name = scanner.nextLine();
        System.out.println("тебя зовут " + name + " кхм..мое любимое имя, но то вообщем не важно");
        System.out.println("Ну что же " + name + " приступим к опросу");
        System.out.println("Тебе надо выбрать где ты будешь жить, выбери: Квартира или дом ");
        String placeOfLiving = scanner.nextLine();
        if (placeOfLiving.equals("квартира")) {
            System.out.println("хороший выбор " + name);
        }
        if (placeOfLiving.equals("дом")) {
            System.out.println("отличный выбор " + name);
        } else {
            System.out.println("погоди, ты должен выбрать из двух вариантов");
        }

        System.out.println("теперь скажи, в свой(ою) " + placeOfLiving + " ты бы выбрал ДИВАН или КРОВАТЬ что б спать");
        String placeForSleaping = scanner.nextLine();
      //тут пока есть пару вопрсов
       try{ if (placeOfLiving.equals("диван")) {
            System.out.println("хороший выбор " + name);
        }}catch (StringIndexOutOfBoundsException e){
           System.out.println(placeForSleaping);
       }
        if (placeOfLiving.equals("кровать")) {
            System.out.println("отличный выбор " + name);
        }
        String s1 = placeForSleaping.substring(0,6);
        System.out.println("теперь ты будешь спать на " + s1 + "е");


    }
}

