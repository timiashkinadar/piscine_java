package d3.ex02;

public class Result extends Thread{
    private int res;
    private int from;
    private int to;
    private int [] arr;

    public Result(int from, int to, int [] arr){
        this.from = from;
        this.to = to;
        this.arr = arr;
    }
    public int getRes(){
        return res;
    }
    public void run(){
        for(int i = from; i <= to; i++){
            res += arr[i];
        }
        System.out.println(this.getName()+ ": from: " + from + " to: " + to + " sum is : " + res);
    }
}
