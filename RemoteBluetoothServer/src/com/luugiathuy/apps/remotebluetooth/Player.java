package com.luugiathuy.apps.remotebluetooth;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;

public abstract class Player {
  protected int UP;
  protected int DOWN;
  protected int LEFT;
  protected int RIGHT;
  protected int BUTTONA;
  protected int BUTTONB;
  protected int START;
  protected static final int[] CONFIG1 = {KeyEvent.VK_1,KeyEvent.VK_2,KeyEvent.VK_3,KeyEvent.VK_4,KeyEvent.VK_5,KeyEvent.VK_6,KeyEvent.VK_7};
  protected static final int[] CONFIG2 = {KeyEvent.VK_8,KeyEvent.VK_9,KeyEvent.VK_0,KeyEvent.VK_Q,KeyEvent.VK_W,KeyEvent.VK_E,KeyEvent.VK_M};
  protected static final int[] CONFIG3 = {KeyEvent.VK_T,KeyEvent.VK_Y,KeyEvent.VK_U,KeyEvent.VK_I,KeyEvent.VK_O,KeyEvent.VK_P,KeyEvent.VK_N};
  protected static final int[] CONFIG4 = {KeyEvent.VK_V,KeyEvent.VK_D,KeyEvent.VK_F,KeyEvent.VK_G,KeyEvent.VK_H,KeyEvent.VK_J,KeyEvent.VK_K};
  protected static final int[] CONFIGX = {KeyEvent.VK_V,KeyEvent.VK_D,KeyEvent.VK_F,KeyEvent.VK_G,KeyEvent.VK_H,KeyEvent.VK_J,KeyEvent.VK_K};
	protected String bid;
	protected String name;
	protected float gyro_offsetX;
	protected float gyro_offsetY;
	protected float gyro_offsetZ;
  protected float accl_offsetX;
	protected float accl_offsetY;
	protected float accl_offsetZ;
  protected boolean gyroCallb = false;
  protected boolean acclCallb = false;
  protected Robot player;

  public Player(String bid, String name, int playerNum) throws AWTException{
    this.player = new Robot();
    int[] config;
    switch(playerNum){
      case 1:
        config = CONFIG1;
        break;
      case 2:
        config = CONFIG2;
        break;
      case 3:
        config = CONFIG3;
        break;
      case 4:
        config = CONFIG4;
        break;
      default:
        config = CONFIGX;
        break;
    }
    this.UP = config[0];
    this.DOWN = config[1];
    this.LEFT = config[2];
    this.RIGHT = config[3];
    this.BUTTONA = config[4];
    this.BUTTONB = config[5];
    this.START = config[6];
    this.bid = bid;
    this.name = name;
  }

  protected void setGyroOffset(float offsetX, float offsetY, float offsetZ){
    this.gyro_offsetX = gyro_offsetX;
    this.gyro_offsetY = gyro_offsetY;
    this.gyro_offsetZ = gyro_offsetZ;
    gyroCallb = true;
  }

  protected void setAcclOffset(float offsetX, float offsetY, float offsetZ){
    this.accl_offsetX = accl_offsetX;
    this.accl_offsetY = accl_offsetY;
    this.accl_offsetZ = accl_offsetZ;
    acclCallb = true;
  }

  protected void pressButton(int key){
    player.keyPress(key);
    player.keyRelease(key);
  }

	protected void updateGyro(float newX, float newY, float newZ){}

	protected void updateAccl(float newX, float newY, float newZ){}

}
