package j02ex_SimpleColorConversion;

import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

class ImageProcessor {
    IColorConverter converter;
    
    public ImageProcessor() {
        converter = null;
    }
    
    public void setColorConverter(IColorConverter converter) {
        this.converter = converter;
    }
    
    public void convertImage(String origFileName, String newFileName) {
        if (converter != null) {        
            try {       
                BufferedImage image = ImageIO.read(new File(origFileName));

                for(int y = 0; y < image.getHeight(); y++) {
                   for(int x = 0; x < image.getWidth(); x++) {
                       Color color = new Color(image.getRGB(x, y));
                       Color newColor = converter.convert(color);
                       image.setRGB(x, y, newColor.getRGB());
                   }
                }

                ImageIO.write(image, "png", new File(newFileName));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}