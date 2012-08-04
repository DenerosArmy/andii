import java.util.*;
import java.awt.Robot;

public class MarioKartPlayer extends Player{

  private static final float xTHRES = 0.0;
  private static final float yTHRES = 0.0;
  private static final float zTHRES = 0.0;
  private Robot player;

  public MarioKartPlayer(String bid, String name, float offsetX, float offsetY, float offsetZ){
    this.bid = bid;
    this.name = name;
    this.offsetX = offsetX;
    this.offsetY = offsetY;
    this.offsetZ = offsetZ;
    this.lastX = offsetX;
    this.lastY = offsetY;
    this.lastZ = offsetZ;
    this.player = new Robot();
  }

  protected void issueCommand(float newX, float newY, float newZ){
    float delX = newX-offsetX;
    float delY = newY-offsetY;
    float delZ = newZ-offsetZ;
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
        System.out.println(Player.RIGHT);
        player.keyPress(Player.RIGHT);
      }else{
        System.out.println(Player.LEFT);
        player.keyPress(Player.LEFT);
      }
    }
  }
}
