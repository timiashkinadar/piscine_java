package d0.ex01;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean status = true;
        int i = 1;
        if (n <= 1) {
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        else if (n == 2 || n == 3){
            System.out.println(status + " " + i);
            System.exit(0);
        }
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                status = false;
                System.out.println(status + " " + i);
                System.exit(0);
            }
        }
        System.out.println(status + " " + i);
        s.close();
    }
}

