package com.company.Collection.ArrayList;

import java.util.*;
import java.util.ArrayList;


public class Start {
    public static void main(String[] args) {




        ArrayList<Car> cars = new ArrayList();//колекию надо инициализировать

        Car car1 = new Car("bmw",21);
        Car car2 = new Car("mers", 22);
        Car car3 = new Car("toyota", 23);
        Car car4 = new Car("volvo", 23);
        Car car5 = new Car("volvo", 21);
        Car car6 = new Car("astra", 20);

            cars.add(car1);
            cars.add(car2);
            cars.add(car3);
            cars.add(car4);
            cars.add(car5);
            cars.add(car6);





        for (Car car : cars){
            System.out.println(car);
        }

       //Collections.sort(cars);

        Collections.sort(cars, new CarNameComparator());

        Collections.sort(cars, new CarYearComparator());

       /* System.out.println("car size =  " + cars.size());// запросили размер колекции

        cars.add(new Car("Tesla")); //это таким образом мы можем
                                    //динамически дополнять колекцию

        int index = cars.indexOf(car4);//таким образом запрашиваем индекс
        System.out.println("Индекс = " + index);//обьекта

        Car selectCar = cars.get(3);//получаем обьект по индексу
        System.out.println(selectCar.getName()  );*/

            Iterator<Car> iterator = cars.iterator();

            while (iterator.hasNext()){
                Car car =  iterator.next();
                System.out.print(car.getName() + " ");
                System.out.println(car.getYear());
            }
        }
    }

