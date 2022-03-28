package bai3_singleton;

public class ShapeFactory{
    public Shape createShape(ShapeType shapeType){
        Shape shape = null;
        if(shapeType.toString().equals("Rectangle"))
            shape = Rectangle.Instance();
        else if(shapeType.toString().equals("Cricle"))
            shape = Cricle.Instance();
        else if(shapeType.toString().equals("Triangle"))
            shape = Triangle.Instance();
        return shape;
    }
}
