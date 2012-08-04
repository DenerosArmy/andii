package com.luugiathuy.apps.remotebluetooth;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.MouseInfo;

public class MousePlayer extends Player {
	private static final float xTHRES = (float) 1.0;
	private static final float yTHRES = (float) 1.0;
	private static final float zTHRES = (float) 1.0;
	private Robot r = new Robot();

	public MousePlayer(String bid, String name, int playerNum) throws AWTException {
	      super(bid, name, playerNum);
	      
	   
	  }
	public int currentX;
	public int currentY;
	
	public void mouseGlide(int x1, int y1, int x2, int y2, int t, int n) {
	    try {
	        Robot r = new Robot();
	        double dx = (x2 - x1) / ((double) n);
	        double dy = (y2 - y1) / ((double) n);
	        double dt = t / ((double) n);
	        r.mousePress(InputEvent.BUTTON1_MASK);
	        for (int step = 1; step <= n; step++) {
	            Thread.sleep((int) dt);
	            r.mouseMove((int) (x1 + dx * step), (int) (y1 + dy * step));
	        }
	        r.mouseRelease(InputEvent.BUTTON1_MASK);
	    } catch (AWTException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	


}