package bai3_singleton;

public class Rectangle extends Shape {
    private static Rectangle instance;
    protected Rectangle(){}

    public static Rectangle Instance(){
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }

    @Override
    public String draw() {
        return "Hinh chu nhat";
    }
}
