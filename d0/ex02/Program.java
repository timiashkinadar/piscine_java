package d0.ex02;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int cof = 0;
        boolean status = true;
        while(n != 42) {
            status = true;
            sum = 0;
            if (n < 2) {
                System.out.print("IllegalArgument");
                return;
            }
            while(n != 0) {
                sum += (n % 10);
                n /= 10;
            }
            for (int i = 2; i < sum; i++) {
                if (sum % i == 0) {
                    status = false;
                    break;
                }
            }
            if (status)
                cof++;
            n = s.nextInt();
        }
        System.out.println("Count of coffee-request - " + cof);
    }
}
