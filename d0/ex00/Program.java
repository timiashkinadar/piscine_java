package d0.ex00;
//import

public class Program {
    public static void main(String[] args) {
        int num = 479598;
        int n1 = num / 100000;
        int n2 = (num / 10000) % 10;
        int n3 = (num / 1000) % 10;
        int n4 = (num / 100) % 10;
        int n5 = (num / 10) % 10;
        int n6 = num % 10;
        int sum = n1 + n2 + n3 + n4 + n5 + n6;
        System.out.print(sum);
    }
}
