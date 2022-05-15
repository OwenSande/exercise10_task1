package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        int bajt;

        try {
            fis = new FileInputStream("test123.txt");

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        try {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            }while (bajt != -1);

        }catch (IOException e){
            System.out.println("Error reading the file");
            return;

        }finally {
            //fis.close();
            try{
                fis.close();
            }catch (IOException e){
                System.out.println("Error closing file");
            }

        }


    }
}
