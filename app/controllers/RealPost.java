package controllers;

import java.io.*;
import java.util.*;

public class RealPost {
    public String owner;
    public String title;
    public String content;
    public int id;
    public int commentCount;
    
    public RealPost(String own, String name, String message, int i) {
        owner = own;
        title = name;
        content = message;
        id = i;
        commentCount = 0;
    }
    
    public RealPost(String own, String name, String message, int i, int c) {
        owner = own;
        title = name;
        content = message;
        id = i;
        commentCount = c;
    }
}