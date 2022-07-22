package d3.ex00;

public class Hen extends Thread{
    private int c;
    Hen(int c){
        this.c = c;
    }
    public void run(){
        for (int i = 0; i < this.c; i++){
            System.out.println("Hen");
        }
    }
}
