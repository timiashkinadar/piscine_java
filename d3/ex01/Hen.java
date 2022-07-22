package d3.ex01;

public class Hen extends Thread{
    private int c;
    Controller contr;
    Object ob;
    Hen(int c, Controller a, Object ob){
        this.c = c;
        this.contr =  a;
        this.ob = ob;
    }
    public void run(){
        synchronized (ob) {
            for (int i = 0; i < this.c; i++) {
                while (contr.get_f() == true) {
                    try {
                        ob.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Heg");
                contr.set_f(true);
                ob.notify();
            }
        }
    }
}
