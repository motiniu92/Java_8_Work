package com.coderbd.exception.file;

import java.io.File;
import java.io.IOException;

public class RenameFile {

    public static void main(String[] args) throws IOException {
        File firstFile = new File("my_first_file.abdul");
        File secondFile = new File("my _second_file.A Motin");

        boolean fileCreated = firstFile.createNewFile();

        if (fileCreated || firstFile.exists()) {
            printFileDetails(firstFile);
            printFileDetails(secondFile);
            boolean renamedFlag = firstFile.renameTo(secondFile);
            if (!renamedFlag) {
                System.out.println("Could not rename " + firstFile);
            }

            printFileDetails(firstFile);
            printFileDetails(secondFile);

        }

    }

    public static void printFileDetails(File f) {
        System.out.println("Absolute Path : " + f.getAbsoluteFile());
        System.out.println("File Exists : " + f.exists());
    }
}
