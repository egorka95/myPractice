package com.company.Collection.Map;

import com.company.Collection.ArrayList.Car;

import java.util.HashMap;

/**
 * Created by nikitarozhkov on 21.06.16.
 */
public class Start {

    public static void main(String[] args) {

        HashMap<String, Car> hashMap = new HashMap<String, Car>();

        hashMap.put("Japon", new Car("Toyota",1994));
        hashMap.put("Denmark", new Car("Volvo",2000));
        hashMap.put("Italian", new Car("Porche",2016));

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.get("Japon"));
        System.out.println(hashMap.get("Denmark"));
        System.out.println(hashMap.get("Italian"));

    }
    }

