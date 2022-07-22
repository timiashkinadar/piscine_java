package d3.ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        if(!args[0].startsWith("--arraySize=") && !args[1].startsWith("--threadsCount=") && args.length != 2)
        {
            System.err.println("Wrong arguments!");
            return;
        }
        int ar_size = Integer.parseInt(args[0].substring(12));
        int threads_c = Integer.parseInt(args[1].substring(15));

        if (ar_size < 1 || threads_c < 1){
            System.err.println("Wrong parameters!");
            return;
        }

        int [] arr = new int [ar_size];
        int sum_el = 0;
        for(int i = 0; i < ar_size; i++)
        {
            arr[i] = 1;
            sum_el += arr[i];
        }
        System.out.println("Sum: " + sum_el);
        Result [] r = new Result[threads_c];

        int step = 0;
        if (ar_size % threads_c == 0){
            step = ar_size / threads_c;
        }
        else {
            step = ar_size / threads_c + 1;
        }
        for(int i = 0; i < threads_c; i++){
            int from = i * step;
            int to = (i + 1) * step - 1;
            if (i == threads_c - 1){
                to = ar_size - 1;
            }
            r[i] = new Result(from, to, arr);
            r[i].start();
        }
        try{
            for (int i = 0; i < threads_c; i++){
                r[i].join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < threads_c; i++){
            sum += r[i].getRes();
        }
        System.out.println("Sum by threads: " + sum);
    }
}
