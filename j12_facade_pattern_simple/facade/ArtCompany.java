package j12_facade_pattern_simple.facade;

import j12_facade_pattern_simple.subsystem.Designer;
import j12_facade_pattern_simple.subsystem.Drawer;
import j12_facade_pattern_simple.subsystem.Painter;

public class ArtCompany {
    private Designer designer;
    private Drawer drawer;
    private Painter painter;

    public ArtCompany(){
        this.designer = new Designer();
        this.drawer = new Drawer();
        this.painter = new Painter();
    }

    public void work(){
        this.designer.analysis();
        this.designer.design();
        this.drawer.draw();
        this.drawer.linePick();
        this.painter.colorScheme();
        this.painter.paint();
    }
}
