/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment6;

/**
 *
 * @author User
 */
public class Customer extends FileHandler{

    public String tittle;
    public String firstName;
    public String lastName;
    public boolean smoker;
    public boolean staff;
    public boolean writeToFile;

    public Customer(String tittle, String firstName, String lastName, boolean smoker, boolean staff, boolean writeToFile) {
        this.tittle = tittle;
        this.firstName= firstName;
        this.lastName= lastName;
        this.smoker= smoker;
        this.staff= staff;
        this.writeToFile= writeToFile;
    }
    public String gettittle(){
        return tittle;        
    }        
    public String getfirstName(){
        return firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    public boolean getsmoker(){
        return smoker;
    }
    public boolean getstaff(){
        return staff;
    } 
    public boolean getwriteToFile(){
        return writeToFile;
    }
    public void settittle(String tittle){
     this.tittle= tittle;   
    }
    public void setfirstName(String firstName){
        this.firstName= firstName;
    }
    public void setlastName(String lastName){
        this.lastName= lastName;
    }
    public void setsmoker(boolean smoker){
        this.smoker= smoker;
    }
    public void setstaff(boolean staff){
        this.staff= smoker;        
    }
    public void setwriteToFile(boolean writeToFile){
        this.writeToFile= writeToFile;
        ProcessFile pro= new ProcessFile();
        //ProcessFile();
    }       
}

