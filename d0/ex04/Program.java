package d0.ex04;

import java.util.Scanner;

public class Program {
    static int[] count_c() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] letter = new int[65535];
        for (char c : str.toCharArray()) {
            letter[c] = letter[c] + 1;
            if (letter[c] > 999) {
                letter[c] = 999;
            }
        }
        s.close();
        return letter;
    }
    static void print_gr(int[] arr, char[] sym) {
        double[] per = new double[10];
        for (int i = 0; i < 10; i++) {
            per[i] = (double) arr[i] / arr[0] * 100;
        }
        char [][] print = new char [12][10];
        for (int i = 0; i < 10; i++){
            print[0][i] = sym[i];
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if (per[j] > 0.0) {
                    per[j] -= 11;
                    print[i][j] = '#';
                }
            }
        }
        for (int i = 11; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (print[i][j] == '\u0000' && i > 1) {
                    if (print[i - 1][j] == '#') {
                        if (j != 0 && arr[j] < 10) {
                            System.out.print(" ");
                        }
                        System.out.print(arr[j] + " ");
                    }
                } else if (print[i][j] != '\u0000') {
                    if (j != 0) {
                        System.out.print(" ");
                    }
                    System.out.print(print[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] letter = count_c();
        int[] arr = new int[10];
        char[] sym = new char[10];
        int max = 0, max_j = 0;
        char c = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 65535; j++) {
                if (letter[j] > max) {
                    max = letter[j];
                    c = (char) j;
                    max_j = j;
                }
            }
            letter[max_j] = 0;
            arr[i] = max;
            sym[i] = c;
            max = 0;
        }
        for (int j = 0; j < 10; j++){
            if (arr[j] == 0)
                sym[j] = ' ';
        }
        print_gr(arr,sym);
    }
}
