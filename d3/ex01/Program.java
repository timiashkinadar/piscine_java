package d3.ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        if (!args[0].startsWith("--count=") && args.length != 1) {
            System.err.println("Wrong arguments!");
            return;
        }
        int n = Integer.parseInt(args[0].substring(8));

        Controller controller = new Controller();

        Object ob = new Object();
        Egg egg = new Egg(n, controller, ob);
        Hen hen = new Hen(n, controller, ob);

        egg.start();
        hen.start();
    }
}
