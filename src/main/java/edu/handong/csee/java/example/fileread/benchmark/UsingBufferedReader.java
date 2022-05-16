package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
	

    public static void main(String[] args) throws IOException {
		
    	String[] files = args[0].split(",");
		for(String name: files) {
			readF(name);
		}
    }

	private static void readF(String args) throws IOException{
        StopWatch.start();

        BufferedReader inputStream= new BufferedReader(new FileReader(args));
        while (inputStream.read()!=-1){}

        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");
        
        inputStream.close();

	}
}