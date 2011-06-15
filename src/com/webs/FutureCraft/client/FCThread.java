package com.webs.FutureCraft.client;

import com.webs.FutureCraft.canvas.CanvasMain;

public class FCThread extends Thread{

	public void run(){
		CanvasMain c = new CanvasMain();
		c.init();
	}
}
