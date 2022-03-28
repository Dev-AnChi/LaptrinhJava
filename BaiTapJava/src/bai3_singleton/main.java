package bai3_singleton;

public class main {
    public static void main(String[] args) {
        ShapeFactory factoty = new ShapeFactory();
        Shape s;
        s = factoty.createShape(ShapeType.Rectangle);
        System.out.println(s.draw());
    }
}
