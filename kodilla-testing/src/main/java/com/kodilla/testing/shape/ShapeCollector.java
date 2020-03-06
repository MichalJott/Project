package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    void addFigure(Shape shape)  {
        shapeList.add(shape);
    }
    boolean removeFigure(Shape shape)   {
        return shapeList.remove(shape);
    }
    Shape getFigure(int n)  {
        return  shapeList.get(n);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    void showFigures()  {
        for (Shape s : shapeList)   {
            System.out.println(s.getShapeName());
        }

    }
}
