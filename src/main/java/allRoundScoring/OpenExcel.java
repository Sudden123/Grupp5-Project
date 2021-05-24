package allRoundScoring;

import java.awt.Desktop;
import java.io.*;

public class OpenExcel {
    public void showScore (){

            try
            {
//constructor of file class having file as argument
                File file = new File("C:\\Prov\\Grupp5.xlsx");
                if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
                {
                    System.out.println("not supported");
                    return;
                }
                Desktop desktop = Desktop.getDesktop();
                if(file.exists())         //checks file exists or not
                    desktop.open(file);              //opens the specified file
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
       }
}
