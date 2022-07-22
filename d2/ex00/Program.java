package d2.ex00;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        int flag = 0;
        File file = new File("/Users/bgreyman/Desktop/p_java/d2/ex00/signatures.txt");
        try {
            Scanner s = new Scanner(file);
            while (s.hasNext())
            {
                String str = s.nextLine();
                String [] arr = str.split(",");
                map.put(arr[0], arr[1].replaceAll("\\s", ""));
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (map.size() == 0)
            return;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        while (!(str.equals("42")))
        {
            try {
                FileInputStream in = new FileInputStream(str);
                FileOutputStream out = new FileOutputStream("result.txt", true);

                byte[] bytes = new byte[10];
                int size = in.read(bytes);
                StringBuffer buf = new StringBuffer();
                for(int i = 0; i < size; i++) {
                    buf.append(Integer.toHexString(bytes[i]).toUpperCase());
                }
                String file_sign = buf.toString();
                for (String c : map.keySet())
                {
                    if(file_sign.startsWith(map.get(c))){
                        System.out.println("PROCESSED");
                        out.write(c.getBytes());
                        out.write('\n');
                        flag = 1;
                        break ;
                    }
                }
                if(flag == 0) {
                    System.out.println("UNDEFINED");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            str = s.nextLine();
        }
    }
}
