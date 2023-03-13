package ioDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args){
      /*  File myFile = new File("jobms/src/ioDemo/file.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

       */
        //code to write in file
       /* try{
            FileWriter fileWriter = new FileWriter("jobms/src/ioDemo/file.txt");
            fileWriter.write("This is my file");
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
       */
        //code to read the file
       /* File myFile = new File("jobms/src/ioDemo/file.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
       */
        //code to delete a file
       /* File myFile  =  new File("jobms/src/ioDemo/file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted this file "+myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting this file");
        }
       */
    }
}
