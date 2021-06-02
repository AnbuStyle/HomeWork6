package ru.geekbrains.efremov;

public abstract class Animals {
    protected String name;
    protected double maxLengthRun;
    protected double maxLengthSwim;
    //protected static int count;  //доработать count не успел

    public Animals(String name, double maxLengthRun, double maxLengthSwim) {
        //count++;
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxLengthSwim = maxLengthSwim;
    }

    //public static void checkAnimals (){
    //  System.out.println(" Всего животных" + Animals.count);
    //}

    public void infoAnimals() {
       //  System.out.printf("name =%s, maxLengthRun =%f, maxLengthSwim = %f", name, maxLengthRun, maxLengthSwim);
    }
}






