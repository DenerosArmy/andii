package com.denerosarmy;

import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class MarioKartPlayer extends Player {
	private static final float xTHRES = (float) 0.0;
	private static final float yTHRES = (float) 0.0;
	private static final float zTHRES = (float) 0.0;
	private Robot player;
	private String bid;
	private String name;
	private float offsetX;
	private float offsetY;
	private float offsetZ;
	private float lastX;
	private float lastY;
	private float lastZ;
	private HashMap idtoPlayer;
	private HashSet playerSet;
	
	public MarioKartPlayer(String bid, String name, float offsetX, float offsetY, float offsetZ) throws AWTException {
	    this.bid = bid;		//bluetooth ID
	    this.name = name;
	    this.offsetX = offsetX;
	    this.offsetY = offsetY;
	    this.offsetZ = offsetZ;
	    this.lastX = offsetX;
	    this.lastY = offsetY;
	    this.lastZ = offsetZ;
	    this.player = new Robot();
	    idtoPlayer = new HashMap(4);
	    playerSet = new HashSet();
	  }
	
	public class PlayerController {
//		this.players;
		public PlayerController() {}
		protected MarioKartPlayer getPlayerByID(String bid) {
			return (MarioKartPlayer) idtoPlayer.get(bid);
		}
		protected void addPlayer(String bid, String name, float offsetX, float offsetY, float offsetZ) throws AWTException {
			playerSet.add(new MarioKartPlayer(bid, name, offsetX, offsetY, offsetZ));
		}
		protected void sendCommandToPlayer(String bid, float newX, float newY, float newZ) {
			getPlayerByID(bid).issueCommand(newX, newY, newZ);
		}
	}
	
	protected void issueCommand(float newX, float newY, float newZ) {
	    float delX = newX-offsetX;
	    float delY = newY-offsetY;
	    float delZ = newZ-offsetZ;
//	    if (Math.abs(delY) > yTHRES){
//	      if (delY > 0){
//	        System.out.println(Player.RIGHT);
//	        player.keyPress(Player.RIGHT);
//	      }else{
//	        System.out.println(Player.LEFT);
//	        player.keyPress(Player.LEFT);
//	      }
//	    }
//	    if (Math.abs(delX) > xTHRES){
//	      if (delX > 0){
//	        System.out.println(Player.RIGHT);
//	        player.keyPress(Player.RIGHT);
//	      }else{
//	        System.out.println(Player.LEFT);
//	        player.keyPress(Player.LEFT);
//	      }
//	    }
	    if (Math.abs(delZ) > zTHRES) {
	    	if (delZ > 0) {
	    		if (Math.abs(delX) > xTHRES) {
	    			if (delX > 0) {
	    				if (Math.abs(delY) > yTHRES){
	    					if (delY > 0) {
	    				        System.out.println(Player.RIGHT);
	    				        player.keyPress(Player.RIGHT);
	    				    } else {
	    				        System.out.println(Player.LEFT);
	    				        player.keyPress(Player.LEFT);
	    				      }
	    				    }
	    			}
	    		}
	    	}
	    }
	  }
	
	
}
