package com.luugiathuy.apps.remotebluetooth;

import java.awt.AWTException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FruitPlayer extends MousePlayer {
	private static final int TOPBOUND = 228;
	private static final int LEFTBOUND = 414;
	private static final int BOTTOMBOUND = 706;
	private static final int RIGHTBOUND =  1064;
	public FruitPlayer(String bid, String name, int playerNum) throws AWTException {
	      super(bid, name, playerNum);
	  }	
	public void main (String[] args) throws FileNotFoundException {
		FakeMouse test = new FakeMouse();
		while (true){
			System.out.println(test.give());
		}
	}
	
	
}
	