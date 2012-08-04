package com.luugiathuy.apps.remotebluetooth;
import java.util.*;
import java.awt.AWTException;

public class MarioKartPlayer extends Player {
	private static final float xTHRES = (float) 1.0;
	private static final float yTHRES = (float) 1.0;
	private static final float zTHRES = (float) 1.0;
	
	public MarioKartPlayer(String bid, String name, int playerNum) throws AWTException {
      super(bid, name, playerNum);
  }

	protected void updateAccl(float newX, float newY, float newZ) {
    if (acclCallb){

	    float delX = newX-accl_offsetX;
	    float delY = newY-accl_offsetY;
	    float delZ = newZ-accl_offsetZ;
      if (Math.abs(delY) > yTHRES){

        if (delY > 0){
          System.out.println(RIGHT);
          player.keyPress(RIGHT);
          player.keyRelease(RIGHT);
        }else{
          System.out.println(LEFT);
          player.keyPress(LEFT);
          player.keyRelease(LEFT);
        }
      }
      if (Math.abs(delX) > xTHRES){
        if (delX > 0){
          System.out.println(BUTTONB);
          player.keyPress(BUTTONB);
          player.keyRelease(BUTTONB);
        }else{
          System.out.println(BUTTONA);
          player.keyPress(BUTTONA);
          player.keyRelease(BUTTONA);
        }
      }
			//if (Math.abs(delZ) > zTHRES) {
				//if (delZ > 0) {
					//if (Math.abs(delX) > xTHRES) {
						//if (delX > 0) {
							//if (Math.abs(delY) > yTHRES){
								//if (delY > 0) {
											//System.out.println(RIGHT);
											//player.keyPress(RIGHT);
									//} else {
											//System.out.println(LEFT);
											//player.keyPress(LEFT);
										//}
									//}
						//}
					//}
				//}
	    //}
	  }
  }
	
}
