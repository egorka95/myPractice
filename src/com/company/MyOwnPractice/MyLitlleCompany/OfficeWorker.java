package com.company.MyOwnPractice.MyLitlleCompany;

import com.company.MyOwnPractice.Cesar.CesarClass;
import com.company.MyOwnPractice.Cesar.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nikitarozhkov on 28.06.16.
 */
public class OfficeWorker {
    public static void main(String[] args) throws IOException {

        //тут мы создали масив роботников офиса
        ArrayList<OfficeEmployee> officeEmployees = new ArrayList();

        //задали их параметры.
        OfficeEmployee officeWorker1 = new OfficeEmployee("Egor", "Rozhkov", "Main", 50000);
        OfficeEmployee officeWorker2 = new OfficeEmployee("Nikita", "Rozhkov", "CMM", 45000);
        OfficeEmployee officeWorker3 = new OfficeEmployee("Sasha", "Rozhkov", "Computer Gaimer", 40000);

        //Проинициолизорвали.
        officeEmployees.add(officeWorker1);
        officeEmployees.add(officeWorker2);
        officeEmployees.add(officeWorker3);

        //Отсортировали по зарплате работников
        Collections.sort(officeEmployees, new OfficeWorkerSallaryComporator());

        for (OfficeEmployee officeEmployee : officeEmployees) {
            System.out.println(officeEmployee);
        }

        //вторая колекция работников "Манаджер"
        ArrayList<Managers> managerses = new ArrayList();

        //задали параметры
        Managers managers1 = new Managers("Papa", "Rozhkov", "Director", 100000);

        //Проиницилизоровали
        managerses.add(managers1);


        //тут я использовал принцып полиморфизма.
        System.out.println(officeWorker1.doYouWork());
        System.out.println(managers1.doYouWork());

        System.out.println("");


        try {
            System.out.println(managers1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //Создали обьект класса CessarClass для дальнейшей шифровки.
        CesarClass cesarClass = new CesarClass();

        //сам код где мы шифруем.
        try {
            System.out.println("Шифр Цезаря");


            String encTxt, decTxt;
            //!!!
            //Не могу понять почему не выводить или не видит мой метод doWork.
            //!!!
            encTxt = cesarClass.encrypt(String.valueOf(officeWorker1));

            System.out.println("Encoded :" + encTxt);
            decTxt = cesarClass.decrypt(encTxt);
            System.out.println("Decrypted :" + decTxt);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //Созадаю файл в который я в дальнейшем занесу своих работников
        final String fileWhichConsistWokers = "myEmployee";
        DataInputStream dataInputStream = null;

        //тут я работаю с декоратором
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileWhichConsistWokers)));

            //заношу своих работников в файл
            //через цыкл фор.
            for (OfficeEmployee officeEmployee : officeEmployees){
                dataOutputStream.writeUTF(String.valueOf(officeEmployee));
            }


            //закрываю поток
            dataOutputStream.close();

            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileWhichConsistWokers)));
            while (true) {
                String fileWhichConsistWokers1 = dataInputStream.readUTF();
                System.out.println(fileWhichConsistWokers1);
            }
            //ловлю все возможные ошибки
        } catch (EOFException e) {
            System.out.println("Reaches out of file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                dataInputStream.close();
            }


        }
    }
}





