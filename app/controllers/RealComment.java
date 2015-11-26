package controllers;

import java.io.*;
import java.util.*;

public class RealComment {
    public RealPost main;
    public String owner;
    public String content;
    public int id;
    
    public RealComment(String own, String message, int i) {
        owner = own;
        content = message;
        id = i;
        main = null;
    }
    
    public RealComment(String own, String message, int i, RealPost m) {
        owner = own;
        content = message;
        id = i;
        main = m;
    }
    
    public void setMain(RealPost m) {
        main = m;
    }
}