package com.luugiathuy.apps.remotebluetooth;
import java.util.*;
import java.awt.AWTException;

public class MarioKartPlayer extends Player {
	private static final float xTHRES = (float) 1.0;
	private static final float yTHRES = (float) 1.0;
	private static final float zTHRES = (float) 1.0;
	private float lastX;
	private float lastY;
	private float lastZ;
	
	public MarioKartPlayer(String bid, String name, int playerNum) throws AWTException {
      super(bid, name, player);
  }

	protected void updateGyro(float newX, float newY, float newZ) {
    if (gyroCallb){
	    float delX = newX-gyro_offsetX;
	    float delY = newY-gyro_offsetY;
	    float delZ = newZ-gyro_offsetZ;
      for (String button:buttons){
        player.keyPress(Integer.parseInt(button));
      }
      if (Math.abs(delY) > yTHRES){
        if (delY > 0){
          System.out.println(Player.RIGHT);
          player.keyPress(Player.RIGHT);
          player.keyRelease(Player.RIGHT);
        }else{
          System.out.println(Player.LEFT);
          player.keyPress(Player.LEFT);
          player.keyRelease(Player.LEFT);
        }
      }
      if (Math.abs(delX) > xTHRES){
        if (delX > 0){
          System.out.println(Player.BUTTONB);
          player.keyPress(Player.BUTTONB);
          player.keyRelease(Player.BUTTONB);
        }else{
          System.out.println(Player.BUTTONA);
          player.keyPress(Player.BUTTONA);
          player.keyRelease(Player.BUTTONA);
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
	
}
