package controllers;

import java.io.*;
import java.util.*;

public class RealPost {
    public String owner;
    public String title;
    public String content;
    public int id;
    
    public RealPost(String own, String name, String message, int i) {
        owner = own;
        title = name;
        content = message;
        id = i;
    }
}