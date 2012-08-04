package com.luugiathuy.apps.remotebluetooth;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;

public abstract class Player {
  protected static final int UP;
  protected static final int DOWN;
  protected static final int LEFT;
  protected static final int RIGHT;
  protected static final int BUTTONA;
  protected static final int BUTTONB;
  protected static final int START;
  protected static final int[] CONFIG1 = ;
  protected static final int[] CONFIG2 = ;
  protected static final int[] CONFIG3 = ;
  protected static final int[] CONFIG4 = ;
	protected Robot player;

  public Player(int playerNum) throws AWTException{
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
    }
    UP = config[0];
    DOWN = config[1];
    LEFT = config[2];
    RIGHT = config[3];
    BUTTONA = config[4];
    BUTTONB = config[5];
    START = config[6];
  }

	protected void issueCommand(float newX, float newY, float newZ, String[] buttons) {
  }
}
