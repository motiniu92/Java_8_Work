
package com.coderbd.exception.file;

import java.io.File;


public class TestFile {
    public static void main(String[] args) throws Exception {
        File newFile = new File("my_new.file.motin"); 
        printFileDetails(newFile);
        
   //Create a new file
        boolean fileCreated = newFile.createNewFile();
        if(!fileCreated){
            System.out.println(newFile + " could not be created." );
        }
        
        printFileDetails(newFile);
   //Delete the new file
        newFile.delete();
        System.out.println("After deleting the new file");
        printFileDetails(newFile);
  //recreate the file      
        newFile.createNewFile();
        printFileDetails(newFile);
  //Let's tell the JVM to delete this file on exit
  //newFile
        System.out.println("After using deleteOnExit() method: ");
        printFileDetails(newFile);
        
    }   
    
    public static void printFileDetails(File f){
        System.out.println("Absolute Path : " + f.getAbsoluteFile());
        System.out.println("File Exists : " + f.exists());
    }   
}

