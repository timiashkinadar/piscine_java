package d0.ex03;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        long all_min = 0;
        int g, min = 10, i = 1;
        Scanner s = new Scanner(System.in);
        for (i = 1; i <= 18; i++) {
            System.out.print("->");
            String str = s.nextLine();
            if (str.equals("42"))
                break;
            else if(!str.equals("Week " + i))
            {
                System.err.println("Illegal Argument");
                System.exit(-1);
            }
            System.out.print("->");
            for (int y = 0; y < 5; y++)
            {
                g = s.nextInt();
                if (g < 1 || g > 9)
                {
                    System.err.println("Illegal Argument");
                    System.exit(-1);
                }
                min = g < min ? g : min;
            }
            all_min = all_min * 10 + min;
            min = 10;
            s.nextLine();
        }
        display_stat(all_min, i - 1);
    }
    private static void display_stat(long all_min, int i)
    {
        int min = 0;
        int pow = i - 1;
        for (int y = 1; y <= i; y++) {
            System.out.print("Week " + y + " ");
            min = (int)((all_min / Math.pow(10, pow)));
            for(int j = 0; j < min; j++)
                System.out.print("=");
            System.out.println(">");
            all_min =  all_min % (int)Math.pow(10, pow);
            pow--;
        }
    }
}
