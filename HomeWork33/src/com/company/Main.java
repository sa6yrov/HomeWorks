package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        FileWriter fileWriter1 = null;
        try {
            fileWriter = new FileWriter(file);
            fileReader = new FileReader("src/com/company/Main.java");
            fileWriter1 = new FileWriter("SecondFile.txt");
            Scanner scn = new Scanner(fileReader);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                fileWriter.write(line + "\n");
                fileWriter1.write(line.trim() + "\n");
            }
        } catch (FileNotFoundException fNf) {
            fNf.printStackTrace();
        } finally {
            fileReader.close();
            fileWriter.close();
            fileWriter1.close();
        }
        try {
            if (file.length() > 100) {
                throw new IllegalStateException("File larger than 100 bytes");
            }
        }catch (IllegalStateException ils){
            ils.printStackTrace();
        }finally {
            System.out.println("Size of [file.txt] is: " + (double)file.length() + " bytes");
        }
    }
}

