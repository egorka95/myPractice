package com.company.PracticeGOIT.OffLineMeeting;

import java.io.*;

/**
 * Created by nikitarozhkov on 24.06.16.
 */
public class Main {

    static final String testFile = "/Users/nikitarozhkov/myPractice/src/com/company/PracticeGOIT/OffLineMeeting/dataFile";
    static final String message = "Hello world, today I try to understand Java";


    public static void main(String[] args)throws IOException {




        BufferedReader inputStream = new BufferedReader(new FileReader("/Users/nikitarozhkov/myPractice/src/com/company/PracticeGOIT/OffLineMeeting/dataFile"));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter("/Users/nikitarozhkov/myPractice/src/com/company/PracticeGOIT/OffLineMeeting/newFile"));
        try {

            String line;
            while ((line = inputStream.readLine())!=null) {

                String [] words = line.split(" ");
                boolean hasWord = false;
                for (String word:words ){
                    if(word.length() >=3 && word.length()>=5)
                        continue;

                    if (hasWord = true){
                        outputStream.write(word);
                    }
                }
            }


        } catch (EOFException e) {
            System.out.println("Reaches out of file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( outputStream!= null) {
                outputStream.close();
            }if (inputStream!=null){
                inputStream.close();
            }
        }

    }
}


