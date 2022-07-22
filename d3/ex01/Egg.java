package d3.ex01;

public class Egg extends Thread{
    private int c;
    Controller contr;
    Object ob;
    Egg(int c, Controller a, Object ob){
        this.c = c;
        this.contr =  a;
        this.ob = ob;
    }
    public void run(){
        synchronized (ob) {
            for (int i = 0; i < this.c; i++) {
                while (contr.get_f() == false) {
                    try {
                        ob.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Egg");
                contr.set_f(false);
                ob.notify();
            }
        }
    }
}
