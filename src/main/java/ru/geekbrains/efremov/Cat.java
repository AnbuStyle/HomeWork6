package ru.geekbrains.efremov;

public class Cat extends Animals{
    public Cat(String name, double maxLengthRun, double maxLengthSwim) {
        super(name, maxLengthRun, maxLengthSwim);
        //this.count;
    }

    protected void swimming() {
        System.out.println("Cats can't swimming");
    }

    protected void running(double distance) {

        if (maxLengthRun >= distance)
            System.out.println(name + " is running " + distance + ".");
        else
            System.out.println(name + " cannot run. Max distance is " + maxLengthRun + " meters");
    }

}


