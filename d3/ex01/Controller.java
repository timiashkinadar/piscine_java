package d3.ex01;

public class Controller {
    private boolean f = true;

    public synchronized boolean get_f (){
        return f;
    }
    public synchronized void set_f (boolean f){
        this.f = f;
    }
}
