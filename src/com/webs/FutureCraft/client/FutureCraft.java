package com.webs.FutureCraft.client;

import com.jme.app.SimpleGame;
import com.webs.FutureCraft.GUI.MainMenu;

public class FutureCraft extends SimpleGame {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		    new MainMenu().gameloop(); //Runs the constructor and then gameloop()

	}

	@Override
	protected void simpleInitGame() {
	

	}
	  @Override
	    protected void simpleRender() {
	        super.simpleRender();
	      
	    }

}
