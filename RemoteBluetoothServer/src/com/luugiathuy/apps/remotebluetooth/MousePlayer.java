package com.luugiathuy.apps.remotebluetooth;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.MouseInfo;

public class MousePlayer extends Player {
  protected float lastX;
  protected float lastY;
  protected float lastZ;
  protected static final int t =100;
  protected static final int n = 10;
  protected static final int k = 100; 
	private Robot r = new Robot();

	public MousePlayer(String bid, String name, int playerNum) throws AWTException {
	      super(bid, name, playerNum);
	      
	   
	  }
	
	public void mouseGlide(int x1, int y1, int x2, int y2) {
	    try {
	    	
	        Robot r = new Robot();
	        double dx = (x2 - x1) / ((double) n);
	        double dy = (y2 - y1) / ((double) n);
	        double dt = t / ((double) n);
	      //r.mousePress(InputEvent.BUTTON1_MASK);
	        for (int step = 1; step <= n; step++) {
	            Thread.sleep((int) dt);
	            r.mouseMove((int) (x1 + dx * step), (int) (y1 + dy * step));
	        }
	     //  r.mouseRelease(InputEvent.BUTTON1_MASK);
	    } catch (AWTException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	


}
