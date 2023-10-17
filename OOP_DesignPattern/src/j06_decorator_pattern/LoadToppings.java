package j06_decorator_pattern;

import j06_decorator_non.LoadToppingsInterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class LoadToppings implements LoadToppingsInterface {
    private String filename;

    public LoadToppings(String filename) {
        this.filename = filename;
    }
    public List<String> load() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            String absolutePath = new File(filename).getAbsolutePath();
            FileReader fr = new FileReader(absolutePath);
            BufferedReader r = new BufferedReader(fr);
            String line = r.readLine();
            while (line != null) {
                line = line.trim();
                if (!line.equals("")) {
                    list.add(line);
                }
                line = r.readLine();
            }
            r.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}