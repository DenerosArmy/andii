package com.luugiathuy.apps.remotebluetooth;


import java.util.*;
import java.awt.AWTException;

public class Game{
  
  private String gamename;
  private Hashtable players;

  public Game(String gamename){
    this.gamename = gamename;
    this.players = new Hashtable();
  }

  protected Player getPlayerByID(String bid) {
    return (Player) players.get(bid);
  }

  protected void addPlayer(String bid, String name, float offsetX, float offsetY, float offsetZ) throws AWTException {
    if (gamename.equals("MarioKart")){
      players.put(bid, new MarioKartPlayer(bid, name, offsetX, offsetY, offsetZ));
    }
  }

  // bid,x,y,z,buttons
  protected void sendCommandToPlayer(String str) {
    String[] commands = str.split(",");
    getPlayerByID(commands[0]).issueCommand(Float.parseFloat(commands[1]), Float.parseFloat(commands[2]), Float.parseFloat(commands[3]), Arrays.copyOfRange(commands, 4, commands.length));
  }
}

