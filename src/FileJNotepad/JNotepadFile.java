/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileJNotepad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author noe
 */
public class JNotepadFile {
    public static final boolean SAVE = true;
    public static final boolean NO_SAVE = false;
    public static final boolean EXIST = true;
    public static final boolean NO_EXIST = false;
            
    private boolean statusFile = NO_SAVE;
    private boolean existFile = NO_EXIST;

    private String fileName;
    
    private FileWriter filewriter;
    private BufferedWriter bufferedWriter; 
    
    public boolean isStatusFile() {
        return statusFile;
    }

    public void setStatusFile(boolean statusFile) {
        this.statusFile = statusFile;
    }

    public boolean isExistFile() {
        return existFile;
    }

    public void setExistFile(boolean existFile) {
        this.existFile = existFile;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void saveFile(String valueNameFile,String content){
        try{
            this.filewriter = new FileWriter(valueNameFile);
            this.bufferedWriter = new BufferedWriter(this.filewriter);

            bufferedWriter.write(content);
            bufferedWriter.close();
            this.fileName = valueNameFile;
        }catch(IOException ex)
        {
          System.out.print("Error :"+ex);
        }
    }
}
