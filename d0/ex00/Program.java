package d0.ex00;
//import

public class Program {
    public static void main(String[] args) {
        int number = 479598;
        int n1 = number / 100000;
        int n2 = (number / 10000) % 10;
        int n3 = (number / 1000) % 10;
        int n4 = (number / 100) % 10;
        int n5 = (number / 10) % 10;
        int n6 = number % 10;
        int sum = n1 + n2 + n3 + n4 + n5 + n6;
        System.out.print(sum);
    }
}
