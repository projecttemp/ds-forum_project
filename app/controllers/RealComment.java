package controllers;

import java.io.*;
import java.util.*;

public class RealComment {
    public String owner;
    public String content;
    public int id;
    public int postId;
    
    public RealComment(String own, String message, int i, int pi) {
        owner = own;
        content = message;
        id = i;
        postId = pi;
    }
}