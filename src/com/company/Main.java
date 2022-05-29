package com.company;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (args.length != 4) throw new MyException("Wrong number of arguments. Correct number is 4!\n" +
                                                        "ARGS: -InputFile -OutputFile -Delay -FramesPerSecond");
            dvd d = new dvd();
            int del = Integer.parseInt(args[2]);
            int fr = Integer.parseInt(args[3]);
            d.delay(args[0], args[1], del, fr);
        }catch(NumberFormatException | FileNotFoundException | MyException e)
        {
            e.printStackTrace();
        }

    }

}

