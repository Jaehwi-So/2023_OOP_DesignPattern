package j15_composite_pattern_ex;

import java.util.ArrayList;
import java.util.List;


//CompositeShape
public class Group implements Shape{
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("도형 그룹 한 번에 그리기");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
