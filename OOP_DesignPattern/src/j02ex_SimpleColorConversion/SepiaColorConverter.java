package j02ex_SimpleColorConversion;

import java.awt.Color;

class SepiaColorConverter implements IColorConverter {
    public Color convert(Color color) {
        int grey = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        int outputRed = 230 * grey / 255;
        int outputGreen = 180 * grey / 255;
        int outputBlue =  150 * grey / 255;;
        
        return new Color(outputRed, outputGreen, outputBlue);
    }
}    