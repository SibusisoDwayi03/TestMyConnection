/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment6;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author User
 */
public class FileHandler extends Assignment6 {

    /**
     *
     * @param filename
     */
    public static void openFIle(String filename) {
    try {
      File myObj = new File("Output6.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    
    }

  }
  public static void ProcessFile(String rec){
    try {
        try (FileWriter Write = new FileWriter("Output.txt")) {
            Write.write("Dr#Shelley#Adams#false#true");
        }
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
  }

  }   
  public static void closeFile(){
      Output6.close();
      
  }

    
}
