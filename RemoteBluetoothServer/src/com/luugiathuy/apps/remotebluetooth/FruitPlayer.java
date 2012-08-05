package com.luugiathuy.apps.remotebluetooth;

import java.awt.AWTException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.MouseInfo;

public class FruitPlayer extends MousePlayer {
	private static final int TOPBOUND = 228;
	private static final int LEFTBOUND = 414;
	private static final int BOTTOMBOUND = 706;
	private static final int RIGHTBOUND =  1064;
	private static final float xMUL = (float) 1;
	private static final float yMUL = (float) 25;
	private static final float zMUL = (float) 1;
	protected int noIgnores;
	protected int currentMouseX = 791;
	protected int currentMouseY = 460;
	public FruitPlayer(String bid, String name, int playerNum) throws AWTException {
	      super(bid, name, playerNum);
	      Robot r = new Robot();
	      System.out.println(currentMouseX + " " + currentMouseY);
	      r.mouseMove(791 , 460);
	      
	  }	
	

  protected void updateAccl(float newX, float newY, float newZ){

    if (acclCallb){
    	System.out.println("NEW COORDINATES " + newX + " " + newY);
    int deltaX = (int) ((lastX- newX) * k);
    int deltaY = (int) ((lastY - newY) * k);
    int pyth = deltaX * deltaX + deltaY * deltaY;
    if (pyth > 8000) {
    
   
    
    System.out.println("Change in coordinates! " + deltaX + " " + deltaY);
    int newMouseX = Math.abs(currentMouseX + deltaX);
    int newMouseY = Math.abs(currentMouseY + deltaY);
    
    System.out.println("NEW LOCATION " + newMouseX + " " + newMouseY);
      mouseGlide(currentMouseX, currentMouseY, newMouseX, newMouseY);
      this.lastX = newX;
      this.lastY = newY;

      this.currentMouseX = newMouseX;
      this.currentMouseY = newMouseY;
    }
  }
  }
	
}
	
