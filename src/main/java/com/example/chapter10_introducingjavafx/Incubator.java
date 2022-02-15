package com.example.chapter10_introducingjavafx;

public class Incubator
{

    // attributes
    private int temperature = 0;
    public static final int MAX = 10;
    public static final int MIN = -10;

    // methods

    // constructor
    public Incubator()
    {
        temperature = 5;
    }

    public int getTemperature()
    {
        return temperature;
    }

    public boolean increaseTemperature()
    {
        if (temperature < MAX)
        {
            temperature++;
            return true;
        }
        return false;
    }

    public boolean decreaseTemperature()
    {
        if (temperature > MIN)
        {
            temperature--;
            return true;
        }
        return false;
    }
}
