package com.company.Collection.Map;

/**
 * Created by nikitarozhkov on 19.06.16.
 */
public class Car implements Comparable<Car> {

    private  int year;
    private String name;


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        return name != null ? name.equals(car.name) : car.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //не понимаю для чего нужно это!!!
    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
