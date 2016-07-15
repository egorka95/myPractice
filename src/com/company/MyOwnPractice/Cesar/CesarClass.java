package com.company.MyOwnPractice.Cesar;

/**
 * Created by nikitarozhkov on 30.06.16.
 */
import javafx.scene.transform.Rotate;

import java.io.*;
public class CesarClass {
    int offset=3;
    //Исключение ( метод потенциально может выбросить исключение с указанным типом)
    public String encrypt(String s) throws IOException
    {
        //подсчет длины строки
        //формула шифра, (шаг 3 буквы вперед)
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            //также для заглавных букв
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'+offset;
                //
                t1=t1%26;
                sb.append((char)(t1+'A'));
            }
            //также для маленьких букв
            else if(t>='a' && t<='z')
            {
                int t1=t-'a'+offset;
                t1=t1%26;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }


//аналогично (вместо +offset, вычитаем -offset) и расшифровываем

    public String decrypt(String s) throws IOException
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'-offset;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'A'));
            }
            else if(t>='a' && t<='z')
            {int t1=t-'a'-offset;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'a'));
            }else if(t>='a' && t<='z')
            {
                int t1=t-'a'+offset;
                t1=t1%26;
                sb.append((char)(t1+'a'));
            }
            else {
                sb.append(t);
            }
        }
        return sb.toString();
    }

    }


