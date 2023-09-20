package j02ex_SimpleColorConversion;

import java.awt.Color;

class InverseColorConverter implements IColorConverter {
    public Color convert(Color color) {
        int outputRed = 255 - color.getRed();
        int outputGreen = 255 - color.getGreen(); 
        int outputBlue = 255 - color.getBlue();
        
        return new Color(outputRed, outputGreen, outputBlue);
    }
}    