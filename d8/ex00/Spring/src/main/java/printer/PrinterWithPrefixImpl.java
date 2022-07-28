package printer;

import renderer.Renderer;


public class PrinterWithPrefixImpl implements Printer{
    private Renderer renderer;
    private String pref = "";

    public PrinterWithPrefixImpl(Renderer renderer){
        this.renderer = renderer;
    }

    public void setPrefix(String s){
        this.pref = s;
    }

    @Override
    public void print(String s) {
        renderer.render(pref + " " + s);
    }
}
