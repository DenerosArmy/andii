package com.luugiathuy.apps.remotebluetooth;


import java.util.*;
import java.awt.AWTException;

public class Game{
  
  private String gamename;
  private Hashtable players;
  private int currPlayer = 1;

  public Game(String gamename){
    this.gamename = gamename;
    this.players = new Hashtable();
  }

  protected Player getPlayerByID(String bid) {
    return (Player) players.get(bid);
  }

  protected void addPlayer(String command) throws AWTException {
    String[] pInfo = command.split(",");
    if (currPlayer < 5){
      if (gamename.equals("MarioKart")){
    	  System.out.println("PEEEEEEEEENIS");
        players.put(pInfo[0], new MarioKartPlayer(pInfo[0], pInfo[1], currPlayer++));
      }
    }
  }

  protected void setPlayerGyro(String command) throws AWTException{
    String[] commands = command.split(",");
    if (!players.containsKey(commands[0])){
      addPlayer(commands[0] + ",derp");
    }
    getPlayerByID(commands[0]).setGyroOffset(Float.parseFloat(commands[1]), Float.parseFloat(commands[2]), Float.parseFloat(commands[3]));
  }

  protected void setPlayerAccl(String command) throws AWTException {
    String[] commands = command.split(",");
    if (!players.containsKey(commands[0])){
      addPlayer(commands[0] + ",derp");
    }
    getPlayerByID(commands[0]).setAcclOffset(Float.parseFloat(commands[1]), Float.parseFloat(commands[2]), Float.parseFloat(commands[3]));
  }

  protected void sendButtonPressToPlayer(String command){
    String[] commands = command.split(",");
    getPlayerByID(commands[0]).pressButton(Integer.parseInt(commands[1]));
  }

  protected void sendUpdateGyroToPlayer(String command){
    String[] commands = command.split(",");
    getPlayerByID(commands[0]).updateGyro(Float.parseFloat(commands[1]), Float.parseFloat(commands[2]), Float.parseFloat(commands[3]));
  }

  protected void sendUpdateAcclToPlayer(String command){
    String[] commands = command.split(",");
    getPlayerByID(commands[0]).updateAccl(Float.parseFloat(commands[1]), Float.parseFloat(commands[2]), Float.parseFloat(commands[3]));
  }

}

