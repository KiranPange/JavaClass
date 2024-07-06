package kkk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("nonexistent-file.txt"));
                String line = reader.readLine();
            System.out.println("1st line of file: " + line);
        } catch (FileNotFoundException e) {
              System.out.println("File notfound: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
                     System.out.println("IOException occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

