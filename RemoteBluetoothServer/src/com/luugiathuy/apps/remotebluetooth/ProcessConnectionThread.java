package com.luugiathuy.apps.remotebluetooth;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.InputStream;

import javax.microedition.io.StreamConnection;

public class ProcessConnectionThread implements Runnable{

	private StreamConnection mConnection;
	
	// Constant that indicate command from devices
	private static final int EXIT_CMD = -1;
	private static final int KEY_RIGHT = 1;
	private static final int KEY_LEFT = 2;
	private static final int BUTTON = 59;
	private static final int ACC = 58;
	private static final int GYRO = 38;
	private static final int SYNCGYRO = 63;
	private static final int SYNCACC = 35;
	
	
	public ProcessConnectionThread(StreamConnection connection){
		mConnection = connection;
	}
	
	@Override
	public void run() {
		try {
			
			// prepare to receive data
			InputStream inputStream = mConnection.openInputStream();
	        
			System.out.println("waiting for input");
	        String array = "";
	        
	        while (true) {
	        	int command = inputStream.read();
	        	if (command == BUTTON) {
	        		//ButtonStuff here
	        		System.out.println(" BUTTON PRESS " + array);
	        		array = "";
	        	}
	        	else if (command == ACC) {
	        		//Acc stuff here
	        		System.out.println(" Acc input " + array);
	        		array = "";
	        	}
	        	else if (command == GYRO) {
	        		//Gyro stuff here 
	        		System.out.println(" Gyro input " + array);
	        		array = "";
	        	}
	        	else if (command == SYNCGYRO){
	        		//Sync Gyro stuff here 
	        		System.out.println(" Sync Gyro input " + array);
	        		array = "";
	        		
	        	}
	        	else if (command == SYNCACC){ 
	        		//Sync Acc stuff here 
	        		System.out.println(" Sync Acc input " + array);
	        		array = "";
	        	}
	        	else if (command == EXIT_CMD) {	
	        		System.out.println("finish process");
	        		break;
	        	}
	        	else { 
	        		array += (char) command;
	        	}
	        	
        	}
        } catch (Exception e) {
    		e.printStackTrace();
    	}
	}
	
	/**
	 * Process the command from client
	 * @param command the command code
	 */
	private void processCommand(String command) {
    RemoteBluetoothServer.game.sendCommandToPlayer(command);
	}
}
