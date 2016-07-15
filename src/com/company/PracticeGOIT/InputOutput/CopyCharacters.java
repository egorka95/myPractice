package com.company.PracticeGOIT.InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by nikitarozhkov on 29.06.16.
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader imputStream = null;
        FileWriter outputStream = null;

        try{
            imputStream = new FileReader("Ss.txt");
            outputStream = new FileWriter("Ss1.txt");

            int c;
            while ((c = imputStream.read()) != -1){
                outputStream.write(c);
            }

        }finally {
            if (imputStream != null){
                imputStream.close();
            }if (outputStream != null){
                outputStream.close();
            }
        }
    }
}
