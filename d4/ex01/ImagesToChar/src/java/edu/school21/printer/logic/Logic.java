package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Logic {

    public static void get_image(String path, char white, char black) {
        try {
            File file = new File(path);
            BufferedImage image = ImageIO.read(file);
            char [][] array = new char [image.getHeight()][image.getWidth()];
            for(int y = 0; y < image.getHeight(); y++){
                for (int x = 0; x < image.getWidth(); x++){
                    int color = image.getRGB(y, x);
                    if(color == Color.BLACK.getRGB())
                        array[y][x] = black;
                    else
                        array[y][x] = white;
                }
            }
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[j][i]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
