package d2.ex01;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> f_1 = new ArrayList<>();
        ArrayList<String> f_2 = new ArrayList<>();
//        ArrayList<String> d;
        int c = 0;
        Map<String, Integer> map = new HashMap<>();

        if(args.length != 2) {
            System.err.print("Wrong number of arguments!");
            System.exit(-1);
        }
        try {
            BufferedReader read_file_1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader read_file_2 = new BufferedReader(new FileReader(args[1]));
            while (read_file_1.ready()){
                String [] arr1 = read_file_1.readLine().split(" ");
                f_1.addAll(Arrays.asList(arr1));
            }
            while (read_file_2.ready()){
                String [] arr2 = read_file_2.readLine().split(" ");
                f_2.addAll(Arrays.asList(arr2));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : f_1){
            if(map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else{
                map.put(s, 1);
            }
        }
        for (String str : f_2){
            if(map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else{
                map.put(str, 1);
            }
        }
        try {
            FileOutputStream wr = new FileOutputStream("Dictionary.txt", true);
            for (String s : map.keySet()){
                c++;
                wr.write(s.getBytes());
                wr.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String name: map.keySet()){
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }
    }
}
