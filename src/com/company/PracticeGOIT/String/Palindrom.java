package com.company.PracticeGOIT.String;

/**
 * Created by nikitarozhkov on 24.06.16.
 */
public class Palindrom {
    public static void main(String[] args) {
        String palidrom = "moom";
        char charArray[] = palidrom.toCharArray();
        boolean isPalidrom = true;

        for (int i = 0; i < charArray.length/2 ; i++){
            isPalidrom = isPalidrom && (charArray[i] == charArray[charArray.length - i - 1/*не понимаю зачем нужно еще делать -1*/]);
        }if (isPalidrom){
            System.out.println("Palidrom");
        }else {
            System.out.println("not palindrom");
        }
    }
}
