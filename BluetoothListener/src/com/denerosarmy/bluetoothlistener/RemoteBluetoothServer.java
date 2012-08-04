package com.denerosarmy.bluetoothlistener;

public class RemoteBluetoothServer{

	public static void main(String[] args) {
    if (args.length < 1){
      Game game = new Game(args[0]);
    }else{
      System.out.println("Please specify the game.");
    }
		Thread waitThread = new Thread(new WaitThread());
		waitThread.start();
	}
}
