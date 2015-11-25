package controllers;

import java.io.*;
import java.util.*;

public class RealPost {
    public String owner;
    public String title;
    public String content;
    public int id;
    private LinkedList<Application.Comment> commentList;
    
    public RealPost(String own, String name, String message, int i) {
        owner = own;
        title = name;
        content = message;
        id = i;
    }
    
    public boolean noComment() {
        return (commentList.isEmpty());
    }
    
    public int postSize() {
        return commentList.size();
    }
    
    public boolean addComment(Application.Comment cmt) {
        return commentList.add(cmt);
    }
    
    public LinkedList<Application.Comment> getList() {
        return commentList;
    }
}