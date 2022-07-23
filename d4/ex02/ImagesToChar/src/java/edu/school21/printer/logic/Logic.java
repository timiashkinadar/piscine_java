package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

@Parameters(separators = "=")
public class Logic {

    @Parameter(names = "--white")
    private String white;
    @Parameter(names = "--black")
    private String black;

    public void run() {
        try {
            File file = new File("src/resources/it.bmp");
            BufferedImage image = ImageIO.read(file);

            ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
                    .foreground(Ansi.FColor.NONE).background(Ansi.BColor.NONE)
                    .build();

            int [][] array = new int [image.getHeight()][image.getWidth()];

            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    int color = image.getRGB(j, i);
                    if (color == Color.WHITE.getRGB()) {
                        cp.print(" ", Ansi.Attribute.NONE, Ansi.FColor.NONE, Ansi.BColor.valueOf(white));
                    } else {
                        cp.print(" ", Ansi.Attribute.NONE, Ansi.FColor.NONE, Ansi.BColor.valueOf(black));
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
