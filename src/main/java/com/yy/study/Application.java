package com.yy.study;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Application {
    public static void main(String[] args) throws Exception {
    	File file = new File("C:\\Users\\49803\\Desktop", "号码.txt");
    	FileReader fr = new FileReader(file, Charset.forName("UTF-8"));
    	BufferedReader br = new BufferedReader(fr);
    	
    	List<String> list = new ArrayList<String>();
    	
    	String str = null;
    	while((str = br.readLine()) != null) {
    		list.add(str.trim());
    	}
    	
    	br.close();

    	
    	File file2 = new File("C:\\Users\\49803\\Desktop", "号码2.txt");
    	FileWriter fw = new FileWriter(file2, Charset.forName("UTF-8"));
    	for(String s : list) {
    		fw.write(s + "," + System.getProperty("line.separator"));
    	}
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	
    	for(String s : list) {
    		fw.write("'" + s + "'" + "," + System.getProperty("line.separator"));
    	}
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	fw.write(System.getProperty("line.separator"));
    	
    	int i=1;
    	for(String s : list) {
    		fw.write("insert into DZ_USER.TMP_201930 values(" + i++ + ", '" + s + "');" + System.getProperty("line.separator"));
    	}
    	fw.flush();
    	fw.close();
    }
}