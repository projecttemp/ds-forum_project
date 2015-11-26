package controllers;

import java.io.*;
import java.util.*;

public class RealComment {
    public String owner;
    public String content;
    public int id;
    
    public RealComment(String own, String message, int i) {
        owner = own;
        content = message;
        id = i;
    }
}