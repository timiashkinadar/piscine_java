package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Program {
    public static void main(String [] args){
        Logic logic = new Logic();
        JCommander.newBuilder().addObject(logic).build().parse(args);
        logic.run();
    }
}