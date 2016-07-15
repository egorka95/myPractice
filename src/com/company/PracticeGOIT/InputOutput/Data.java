package com.company.PracticeGOIT.InputOutput;

import java.io.*;

/**
 * Created by nikitarozhkov on 29.06.16.
 */
public class Data {
    static final String dataFile = "invoicedata";

    static final double[] prices = {19.9, 20.6, 34.6};
    static final int[] units = {12, 4, 5, 2, 3};
    static final String[] descs = {
            "Java String",
            "Java work",
            "Java T-shirts",
            "Java Pink"};


    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = null;

        try {
            DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

            for (int i = 0; i < prices.length; i++) {
                outputStream.writeDouble(prices[i]);
                outputStream.writeInt(units[i]);
                outputStream.writeUTF(descs[i]);
            }

            outputStream.close();

            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
            while (true) {
                double prices = inputStream.readDouble();
                int unit = inputStream.readInt();
                String descs = inputStream.readUTF();
                System.out.format("You ordered %d units of $",unit,descs,prices);
                double total = unit * prices;
            }


        }catch (EOFException e){
            System.out.println("Reaches out of file");
    }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (inputStream != null){
                inputStream.close();
            }
        }

    }
}

