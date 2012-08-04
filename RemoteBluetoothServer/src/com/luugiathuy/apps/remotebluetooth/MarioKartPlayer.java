package com.luugiathuy.apps.remotebluetooth;
import java.util.*;
import java.awt.AWTException;

public class MarioKartPlayer extends Player {
	private static final float xTHRES = (float) 1.0;
	private static final float yTHRES = (float) 1.0;
	private static final float zTHRES = (float) 1.0;
	private String bid;
	private String name;
	private float offsetX;
	private float offsetY;
	private float offsetZ;
	private float lastX;
	private float lastY;
	private float lastZ;
	
	public MarioKartPlayer(String bid, String name, float offsetX, float offsetY, float offsetZ) throws AWTException {
      super();
	    this.bid = bid;		//bluetooth ID
	    this.name = name;
	    this.offsetX = offsetX;
	    this.offsetY = offsetY;
	    this.offsetZ = offsetZ;
	    this.lastX = offsetX;
	    this.lastY = offsetY;
	    this.lastZ = offsetZ;
  }
	
	protected void issueCommand(float newX, float newY, float newZ, String[] buttons) {
	    float delX = newX-offsetX;
	    float delY = newY-offsetY;
	    float delZ = newZ-offsetZ;
      for (String button:buttons){
        player.keyPress(Integer.parseInt(button));
      }
      if (Math.abs(delY) > yTHRES){
        if (delY > 0){
          System.out.println(Player.RIGHT);
          player.keyPress(Player.RIGHT);
        }else{
          System.out.println(Player.LEFT);
          player.keyPress(Player.LEFT);
        }
      }
      if (Math.abs(delX) > xTHRES){
        if (delX > 0){
          System.out.println(Player.BUTTONB);
          player.keyPress(Player.BUTTONB);
        }else{
          System.out.println(Player.BUTTONA);
          player.keyPress(Player.BUTTONA);
        }
      }
			//if (Math.abs(delZ) > zTHRES) {
				//if (delZ > 0) {
					//if (Math.abs(delX) > xTHRES) {
						//if (delX > 0) {
							//if (Math.abs(delY) > yTHRES){
								//if (delY > 0) {
											//System.out.println(Player.RIGHT);
											//player.keyPress(Player.RIGHT);
									//} else {
											//System.out.println(Player.LEFT);
											//player.keyPress(Player.LEFT);
										//}
									//}
						//}
					//}
				//}
	    //}
	  }
	
}
