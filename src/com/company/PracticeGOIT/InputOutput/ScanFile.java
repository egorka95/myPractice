package com.company.PracticeGOIT.InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by nikitarozhkov on 29.06.16.
 */
public class ScanFile {
    public static void main(String[] args)throws IOException {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("Ss.txt")));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
