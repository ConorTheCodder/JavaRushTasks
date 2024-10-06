package com.javarush.task.pro.task10.task1016;

public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }



    int min(int a, int b)
    {
        return a < b ? a : b;
    }

    int min(int a, int b, int c)
    {
        int t = this.min(a, b);
        return this.min(t, c);
    }
}
