package com.denerosarmy.bluetoothlistener;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;

public abstract class Player {
  protected static final int UP = KeyEvent.VK_UP;
  protected static final int DOWN = KeyEvent.VK_DOWN;
  protected static final int LEFT = KeyEvent.VK_LEFT;
  protected static final int RIGHT = KeyEvent.VK_RIGHT;
  protected static final int BUTTONA = KeyEvent.VK_A;
  protected static final int BUTTONB = KeyEvent.VK_B;
  protected static final int START = KeyEvent.VK_SHIFT;
	protected Robot player;

  public Player() throws AWTException{
    this.player = new Robot();
  }

	protected void issueCommand(float newX, float newY, float newZ, String[] buttons) {
  }
}
