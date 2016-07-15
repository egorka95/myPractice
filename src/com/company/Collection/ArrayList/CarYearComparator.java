package com.company.Collection.ArrayList;

import java.util.Comparator;

/**
 * Created by nikitarozhkov on 19.06.16.
 */
public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer year1 = new Integer(car1.getYear());//преобразовываем в Интеджер
        Integer year2 = new Integer(car2.getYear());
        return year1.compareTo(year2);
    }
}
