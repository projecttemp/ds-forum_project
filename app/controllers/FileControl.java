package controllers;

import java.io.*;
import java.util.*;

public class FileControl {
    public static String filePath = "\\Posts";
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
            
            filePath = filePath + "\\";
            
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
        String path = filePath + dName + "\\" + fName + ".txt";
        File newFile;
        
        try {
            newFile = new File(path);
            
            return newFile;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public LinkedList<RealPost> readPostList () {
        try {
            LinkedList<RealPost> list = new LinkedList<RealPost>();
            String path;
            File temp;
            
            for (final File entry : mainFolder.listFiles()) {
                if (entry.isDirectory()) {
                    path = filePath + entry.getName() + "\\0.post";
                    temp = new File(path);
                    
                    if (temp.exists()) {
                        list.add(readPost(temp));    
                    } else {
                        System.out.println("File at " + path + " does not exist!");
                    }
                    
                }
            }
            
            System.out.println("There are " + list.size() + " posts found and added.");
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    private RealPost readPost(File in) {
        try {
            BufferedReader input = new BufferedReader(new FileReader (in));
            String owner, title, content = "";
            String line;
            int id, cc;
            
            line = input.readLine();
            if (line == null)
                return null;
            id = Integer.parseInt(line);
            
            line = input.readLine();
            if (line == null)
                return null;
            cc = Integer.parseInt(line);
            
            owner = input.readLine();
            if (owner == null)
                return null;
            
            title = input.readLine();
            if (title == null)
                return null;
            
            line = input.readLine();
            while (line != null) {
                content = content + line;
                line = input.readLine();
            }
            
            RealPost result = new RealPost(owner, title, content, id, cc);
            return result;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    private RealComment readComment(File in) {
        try {
            BufferedReader input = new BufferedReader(new FileReader (in));
            String owner, content = "";
            String line;
            int id, pid;
            
            line = input.readLine();
            if (line == null)
                return null;
            pid = Integer.parseInt(line);
            
            line = input.readLine();
            if (line == null)
                return null;
            id = Integer.parseInt(line);
            
            owner = input.readLine();
            if (owner == null)
                return null;
            
            line = input.readLine();
            while (line != null) {
                content = content + line;
                line = input.readLine();
            }
            
            RealComment result = new RealComment(owner, content, id, pid);
            return result;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public boolean writePost(RealPost post) {
        try {
            String path = filePath + post.id;
            File out = new File(path);
            if (!out.isDirectory()) {
                if (out.exists())
                    out.delete();
                out.mkdir();
            }
            
            path = path + "\\0.post";
            out = new File(path);
            if (out.exists())
                out.delete();
            out.createNewFile();
            
            PrintWriter fout = new PrintWriter(out);
            
            fout.println(post.id);
            fout.println(post.commentCount);
            fout.println(post.owner);
            fout.println(post.title);
            fout.println(post.content);
            fout.close();
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean writeComment(RealComment comment) {
        try {
            String path = filePath + comment.postId;
            File out = new File(path);
            if (!out.isDirectory()) {
                if (out.exists())
                    out.delete();
                out.mkdir();
            }
            
            path = path + "\\" + comment.id + ".postcomment";
            out = new File(path);
            if (out.exists())
                out.delete();
            out.createNewFile();
            
            PrintWriter fout = new PrintWriter(out);
            
            fout.println(comment.postId);
            fout.println(comment.id);
            fout.println(comment.owner);
            fout.println(comment.content);
            fout.close();
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}