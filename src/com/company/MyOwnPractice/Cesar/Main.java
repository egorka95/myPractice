package com.company.MyOwnPractice.Cesar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by nikitarozhkov on 30.06.16.
 */
public class Main {





        public static void main(String[] args) {


            CesarClass cesarClass = new CesarClass();


            try
            {
                System.out.println("Шифр Цезаря");
                BufferedReader b;
                String oriTxt,encTxt,decTxt;
                System.out.println("Please enter the word to cipher:");
                b=new BufferedReader(new InputStreamReader(System.in));
                oriTxt=b.readLine();
                Main c= new Main();
                encTxt=cesarClass.encrypt(oriTxt);
                System.out.println("Encoded :"+encTxt);
                decTxt=cesarClass.decrypt(encTxt);
                System.out.println("Decrypted :"+decTxt);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }

