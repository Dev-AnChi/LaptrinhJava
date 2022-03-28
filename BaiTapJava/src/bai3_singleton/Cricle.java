package bai3_singleton;

public class Cricle extends Shape{
    private static Cricle instance;
    protected Cricle(){}

    public static Cricle Instance(){
        if(instance == null)
            instance = new Cricle();
        return instance;
    }

    @Override
    public String draw() {
        return "Day la hinh tron";
    }
}
