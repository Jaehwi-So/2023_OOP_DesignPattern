package j02ex_SimpleColorConversion;

import java.awt.Color;

class RemoveRedColorConverter implements IColorConverter {
    public Color convert(Color color) {
        int outputRed = 0;
        int outputGreen = color.getGreen(); 
        int outputBlue = color.getBlue();
        
        return new Color(outputRed, outputGreen, outputBlue);
    }
}    