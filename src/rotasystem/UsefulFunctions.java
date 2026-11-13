/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotasystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CJ20b
 */
public class UsefulFunctions {
    
    public void SaveToFile(String ToWrite, String FileName){
        FileWriter fw = null;
        try {
            fw = new FileWriter(FileName,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(ToWrite);
            bw.newLine();
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(UsefulFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    
    public int getid(String FileName, String Seperator, int index) throws IOException{
 
    int id = 1; 
        
        
    FileReader fr = null;
        try {
            fr = new FileReader(FileName);
            
            
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            String finalV ="";
            while ((line=br.readLine()) !=null){
                finalV =line;
            }
            String [] items = finalV.split(Seperator);
            id = Integer.parseInt(items[index]);
            return id+1;
            
        } catch (FileNotFoundException ex) {
            // Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            return id;
        }
    }
    
    /**
     *
     */
    public void GetDateAndTime(){
         Calendar cal=Calendar.getInstance();
         cal.setTimeInMillis(System.currentTimeMillis());
         SimpleDateFormat format=new SimpleDateFormat("dd:MM:yyyy,HH:mm");
         String Temp = format.format(cal.getTime());
        
        
        
    }
    
    
    
    
    
    
    
    }
}
