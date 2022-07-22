package d2.ex02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Wrong number of arguments!");
            return;
        }
        Path path = null;
        if (args[0].startsWith("--current-folder=")) {
            path = Paths.get(args[0].substring(17));
        } else {
            System.err.println("Wrong path!");
            return;
        }
        File f = new File(String.valueOf(path));
        if (!f.isDirectory()) {
            System.err.println("Path doesn't exist!");
        }
        Scanner s = new Scanner(System.in);
        String command;
        System.out.print("->");
        while (s.hasNext()) {
            command = s.nextLine();
            if (command.equals("exit")) {
                System.exit(0);
            } else if (command.startsWith("ls")) {
                File[] files = f.listFiles();
                for (File file : files) {
                    if (!file.isHidden()) {
                        int size = (int) file.length() / 1024;
                        System.out.println(file.getName() + " " + size + " KB");
                    }
                }
            } else if (command.startsWith("cd")) {
                String new_command = path + "/" + command.substring(3);
                Path new_path = Paths.get(new_command);
                f = new File(new_path.toString());
                if (f.isDirectory()) {
                    path = new_path;
                    System.out.println(new_path);
                } else {
                    System.err.println("Wrong directory!");
                }
            } else if (command.startsWith("mv")) {
                String[] c = command.split(" ");
                Path what = Paths.get(path + "/" + c[1]);
                Path where = Paths.get(path + "/" + c[2]);
                if (Files.isRegularFile(what)) {
                    if (Files.isDirectory(where)) {
                        where = Paths.get(where + "/" + what.getFileName());
                    }
                    Files.move(what, where, StandardCopyOption.REPLACE_EXISTING);
                }
            }
            System.out.print("->");
        }
    }
}