package com.luugiathuy.apps.remotebluetooth;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FakeMouse {
	public File file = new File("/Users/vaishaal/Downloads/text.txt");
	public String line;
	public Scanner scanner;
	
	
	public FakeMouse() throws FileNotFoundException  { 
		Scanner scanner = new Scanner(file);
	}
	
	public static String give() throws FileNotFoundException {
		FakeMouse test = new FakeMouse();
		String line = test.scanner.nextLine();
		int index = line.indexOf("40");
		if (index == -1) {
			return "";
		}
		index += 3;
		return line.substring(index, line.length());
	}
}