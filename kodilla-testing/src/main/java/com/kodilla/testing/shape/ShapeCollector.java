package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> shapeList;

    public int getListSize(){
        return shapeList.size();
    }
    public ShapeCollector() {
        shapeList = new ArrayList<>();
    }

    public void addFigure(Shape shape){
        shapeList.add(this.shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeList.contains(this.shape))
        {
            shapeList.remove(this.shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        return shapeList.get(n);
    }
    public void showFigures(){

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shape.equals(that.shape);
    }
    @Override
    public int hashCode() {
        return shape.hashCode();
    }
}