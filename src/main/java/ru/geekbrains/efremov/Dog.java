package ru.geekbrains.efremov;

public class Dog extends Animals{
    public Dog(String name, double maxLengthRun, double  maxLengthSwim) {
        super(name, maxLengthRun, maxLengthSwim);
    }
    public boolean swimming(double distance) {

        if (maxLengthSwim >= distance)
            System.out.println(name + " is swimming " + distance + ".");
        else
            System.out.println(name + " cannot swim. Max distance is " + maxLengthSwim + " meters");
        return false;
    }

    protected void running(double distance) {

        if (maxLengthRun >= distance)
            System.out.println(name + " is running " + distance + ".");
        else
            System.out.println(name + " cannot run. Max distance is " + maxLengthRun + " meters" );
    }
}