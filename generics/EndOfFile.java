package com.coderbd.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EndOfFile {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Abdul.txt"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }

            try (DataInputStream input = new DataInputStream(new FileInputStream("Abdul.txt"))) {
                while (true) {
                    System.out.println(input.readDouble());
                }
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
