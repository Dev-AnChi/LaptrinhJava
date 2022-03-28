package bai3_singleton;

public class Triangle extends Shape{
    private static Triangle instance;

    protected Triangle(){}

    public static Triangle Instance(){
        if(instance == null)
            instance = new Triangle();
        return instance;
    }

    @Override
    public String draw() {
        return "Day la hinh tam giac";
    }
}
