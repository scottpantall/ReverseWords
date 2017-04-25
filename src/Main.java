/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            reverseWords(line);
        }
    }
    
    public static void reverseWords(String line) {
        String[] words = line.split(" ");
        
        for(int i = words.length - 1; i >= 0; i-- ) {
            System.out.printf(words[i] + " ");
        }
        System.out.printf("%n");
    }
}
