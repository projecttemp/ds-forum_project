package controllers;

import java.io.*;

public class FileControl {
    public static String filePath = "/Posts";
    public static File mainFolder;
    
    public FileControl(String p) {
        try {
            File temp = new File(".");
            filePath = temp.getCanonicalPath() + "\\" + p;
        
            mainFolder = new File(filePath);
            
            if (!mainFolder.isDirectory()) {
                if (mainFolder.exists())
                    mainFolder.delete();
                mainFolder.mkdir();
            }
            
            filePath = filePath + "/";
            
            File newnew = new File(".");
            
            System.out.println(mainFolder.getAbsolutePath());
            //System.out.println(newnew.getCanonicalPath());
            //System.out.println(FileControl.java.getProtectionDomain().getCodeSource().getLocation().getPath());
        } catch (Exception e) {
            System.out.println(e);
            mainFolder = null;
        }
    }
    
    public boolean addFolder(String name) {
        String path = filePath + name;
        File folder;
        
        try {
            folder = new File(path);
            
            if (folder.isDirectory()) {
                return true;
            } else {
                if (folder.exists())
                    folder.delete();
                folder.mkdir();
                
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public File addFile(String dName, String fName) {
        String path = filePath + dName + "/" + fName + ".txt";
        File newFile;
        
        try {
            newFile = new File(path);
            
            return newFile;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}