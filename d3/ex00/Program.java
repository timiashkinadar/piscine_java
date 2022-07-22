package d3.ex00;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        if(!args[0].startsWith("--count=") && args.length != 1)
        {
            System.err.println("Wrong arguments!");
            return;
        }
        int n = Integer.parseInt(args[0].substring(8));

        Egg egg = new Egg(n);
        Hen hen = new Hen(n);

        egg.start();
        hen.start();

        try {
            egg.join();
            hen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++){
            System.out.println("Human");
        }
    }
}
