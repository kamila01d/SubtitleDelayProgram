package com.company;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class dvd {
    public void delay(String in, String out,int delay, int fps)throws FileNotFoundException, MyException, NumberFormatException{


        Scanner scanner = new Scanner(new File(in));
        PrintWriter fout = new PrintWriter(out);
        String s = "";
        int previous = 0;
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
            String[] splitting = s.split("[{}]");

            Integer v = Integer.parseInt(splitting[1]);
            Integer b = Integer.parseInt(splitting[3]);
            if (v < (previous)) throw new MyException("Value of previous Frame " + previous + " is greater than current frame "+ v);
            if (v > b) throw new MyException("Value of first Frame " + v + " is greater than current frame "+ b);
            v = v + delay / fps;
            previous = b;
            b = b + delay / fps;
            fout.write("{" + v + "}{" + b + "}" + splitting[4] + '\n');

        }
        fout.close();
         scanner.close();
        }




    }




