package j02ex_SimpleColorConversion;

import java.awt.Color;

class GreyColorConverter implements IColorConverter {
    public Color convert(Color color) {
        int grey = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        int outputRed = grey;
        int outputGreen = grey;
        int outputBlue = grey;
        
        return new Color(outputRed, outputGreen, outputBlue);
    }
}    