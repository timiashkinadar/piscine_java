package d4.ex00.ImagesToChar.src.java.edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

public class Program {
    public static void main(String [] args){
        if(args.length != 3){
            System.err.println("Wrong number of arguments!");
            System.exit(-1);
        }
        if(args[0].length() != 1 || args[1].length() != 1){
            System.err.println("Wrong symbols");
            System.exit(-1);
        }
        char first = args[0].charAt(0);
        char second = args[1].charAt(0);
        String path = args[2];

        Logic.get_image(path, first, second);
    }
}