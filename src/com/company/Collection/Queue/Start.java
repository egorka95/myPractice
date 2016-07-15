package com.company.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by nikitarozhkov on 19.06.16.
 */
public class Start {

    public static void main(String[] args) {


        //Queue<Car> cars = new ArrayBlockingQueue<Car>(6);//колекию надо инициализировать
        Deque<Car> cars = new ArrayDeque<Car>();

        Car car1 = new Car ("bmw");
        Car car2 = new Car ("mers");
        Car car3 = new Car ("toyota");
        Car car4 = new Car ("volvo");
        Car car5 = new Car ("volvo");
        Car car6 = new Car ("astra");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        for (Car car : cars){
            System.out.println(car);
        }

        //System.out.println(cars.element());//полуение верхнего елемента из очереди без удаления
        //System.out.println(cars.remove());//получение нижнего елемента из очереди с удалением

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            Car car =  iterator.next();
            System.out.println(car.getName());
    }
}
}
