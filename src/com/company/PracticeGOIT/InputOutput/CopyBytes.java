package com.company.PracticeGOIT.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by nikitarozhkov on 29.06.16.
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        try(final FileInputStream inputStream = new FileInputStream("Ss.txt");
        FileOutputStream outputStream = new FileOutputStream("Ss1.txt");){
            int c;

            while ((c=inputStream.read()) != -1){
                outputStream.write(c);
            }
        }

    }
}
