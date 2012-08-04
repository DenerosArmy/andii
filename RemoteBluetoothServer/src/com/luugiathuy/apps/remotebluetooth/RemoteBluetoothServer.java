package com.luugiathuy.apps.remotebluetooth;

public class RemoteBluetoothServer{

  protected static Game game;
	
	public static void main(String[] args) {
    if (args.length > 0){ 
      RemoteBluetoothServer.game = new Game(args[0]);
    }else{
      System.out.println("Please specify a game.");
    }
		Thread waitThread = new Thread(new WaitThread());
		waitThread.start();
	}
}
