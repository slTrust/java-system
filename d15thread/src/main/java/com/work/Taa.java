package com.work;

import java.io.File;

public class Taa {
    public static void main(String[] args) {
        File a = new File("./d15thread/src/main/resources");
        if(a.exists()){
            System.out.println(a.getAbsoluteFile());
        }
    }
}
