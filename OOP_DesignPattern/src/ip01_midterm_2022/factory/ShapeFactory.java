package ip01_midterm_2022.factory;

import ip01_midterm_2022.component.Rectangle;
import ip01_midterm_2022.component.Shape;
import ip01_midterm_2022.component.Triangle;

public class ShapeFactory implements ShapeFactoryInterface{
    @Override
    public Shape createShape(String type, String name, int min, int max) {
        if(type.equals("Rectangle")){
            return new Rectangle(name, min, max);
        }
        else if(type.equals("Triangle")){
            return new Triangle(name, min, max);
        }
        else{
            return null;
        }
    }
}
