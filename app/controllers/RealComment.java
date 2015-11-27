package controllers;

import java.io.*;
import java.util.*;

public class RealComment {
    public String owner;
    public String content;
    public int mainID;
    public int id;
    
    public RealComment(String own, String message, int i) {
        owner = own;
        content = message;
        id = i;
        mainID = -1;
    }
    
    public RealComment(String own, String message, int i, int m) {
        owner = own;
        content = message;
        id = i;
        mainID = m;
    }
    
    public void setMain(int m) {
        mainID = m;
    }
}