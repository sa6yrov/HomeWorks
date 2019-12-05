package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Song song = new Song("Gucci gang", "Trap", "Lil Pump", "Gucci Gang, ooh, yeah, Lil Pump, yeah, Gucci Gang, ooh\n" +
                "Gucci gang, Gucci gang, Gucci gang, Gucci gang\n" +
                "Gucci gang, Gucci gang, Gucci gang (Gucci gang!)\n" +
                "Spend ten racks on a new chain\n" +
                "My bitch love do cocaine, ooh\n" +
                "I fuck a bitch, I forgot her name\n" +
                "I can't buy a bitch no wedding ring");
        //Task B
        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write(song.getTitle() + "\n" + song.getGenre() + "\n" + song.getExecutor() +"\n" + song.getLyrics());
        fileWriter.close();
        
        
        //Task A
        FileReader fileReader = new FileReader("song.txt");
        Scanner scn = new Scanner(fileReader);
        String[] info = new String[11];
        for (int i = 1; scn.hasNextLine(); i++) {
            info[i] = scn.nextLine();
        }
        fileReader.close();
        String lyric = "";
        for(int i = 4; i < info.length;i++){
            lyric += "\n" + info[i];
        }
        Song song1 = new Song(info[1], info[2], info[3], lyric);
        System.out.println(song1.getTitle());
        System.out.println(song1.getGenre());
        System.out.println(song1.getExecutor());
        System.out.println(song1.getLyrics());
    }
}
