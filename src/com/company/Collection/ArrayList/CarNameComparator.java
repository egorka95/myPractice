package com.company.Collection.ArrayList;


import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1,Car car2) {//тут мы задаем параментры
        return car1.getName().compareTo(car2.getName());
    }
}
