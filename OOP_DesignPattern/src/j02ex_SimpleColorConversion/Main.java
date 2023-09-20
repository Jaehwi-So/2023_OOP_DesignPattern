package j02ex_SimpleColorConversion;

import java.io.*;
import java.io.IOException;

class Main {
    private ImageProcessor imageProcessor;
    
    public Main() {
        imageProcessor = new ImageProcessor();
    }
    
    public void convert(String origFileName, String newFileName, IColorConverter converter) {
        imageProcessor.setColorConverter(converter);
        imageProcessor.convertImage(origFileName, newFileName);        
    }
       
    public static void main(String[] args) {
        final String HOUSE = "house.png";
        
        Main m = new Main();
        IColorConverter converter = new GreyColorConverter();
        m.convert(HOUSE, "g_" + HOUSE, converter);
        
        converter = new SepiaColorConverter();
        m.convert(HOUSE, "s_" + HOUSE, converter);
        
        if (args.length > 0) {
            String prefix = args[0];
            String filterName = args[1];
            System.out.printf("prefix = %s, filterName = %s\n", prefix, filterName);
            try {            
                Class<?> cls = Class.forName(filterName);
                converter = (IColorConverter) cls.getDeclaredConstructor().newInstance();
                m.convert(HOUSE, prefix + HOUSE, converter);            
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
            
/*        String prefix;
        String filterName;
        try {        
            BufferedReader f = new BufferedReader(new FileReader("filters.txt"));        
            while ((prefix = f.readLine()) != null) { // ���Ͽ��� ���ڿ��� ����� �����ٸ�
                filterName = f.readLine();
                System.out.printf("prefix = %s, filterName = %s\n", prefix, filterName);
                Class<?> cls = Class.forName(filterName);
                IColorConverter converter = (IColorConverter) cls.getDeclaredConstructor().newInstance();
                m.convert(HOUSE, prefix + HOUSE, converter);            
            }
            f.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
