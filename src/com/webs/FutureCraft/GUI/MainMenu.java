package com.webs.FutureCraft.GUI;

import java.io.IOException;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import de.matthiasmann.twl.Button;
import de.matthiasmann.twl.GUI;
import de.matthiasmann.twl.Widget;
import de.matthiasmann.twl.renderer.lwjgl.LWJGLRenderer;
import de.matthiasmann.twl.theme.ThemeManager;


public class MainMenu extends Widget {
	//main menu GUI stuff
	int WIDTH = 1000;
	int HEIGHT	 = 500;
	private GUI gui;
	private LWJGLRenderer renderer;
	private ThemeManager themeManager;
	private Button button;
	// constructor 
	
	public MainMenu(){
		    setupLWJGL();
		    setupOpenGL();
		    initTWL();
		    createButton();

	}
	private void initTWL() {
		// TODO Auto-generated method stub
		try{
		    renderer = new LWJGLRenderer();
		}catch(LWJGLException e){
		    e.printStackTrace();
		}

		gui = new GUI(this, renderer);
		try{
		    themeManager = ThemeManager.createThemeManager(getClass().getResource("MainMenu.xml"), renderer);
		} catch(IOException e){
		    e.printStackTrace();
		}

		gui.applyTheme(themeManager);
	}
	private void createButton() {
	    Button button = new Button("Epic button");
	    button.setTheme("button");
	    add(button);
	}
	private void setupLWJGL() {
	    try {
	        Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
	        Display.setTitle("FutureCraft v0.1");
	        Display.create();
	    } catch (LWJGLException e) {
	        e.printStackTrace();
	    }
	}

	private void setupOpenGL() {
	    GL11.glMatrixMode(GL11.GL_PROJECTION);
	    GL11.glLoadIdentity();

	    GL11.glViewport(0, 0, WIDTH, HEIGHT);
	    GL11.glOrtho(0.0f, WIDTH, HEIGHT, 0.0f, -1.0f, 1.0f);

	    GL11.glClearColor(0, 0, 0, 1);
	}
	protected void layout(){
	/*   button.setPosition(100, 100);
	   button.setSize(100, 33);
	   button.adjustSize(); //Calculate optimal size instead of manually setting it */
	}
	public void gameloop() {
	    while (!Display.isCloseRequested()) {
	        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT); //Clear screen with the clear color
	        gui.update(); //Take input, update and draw the GUI. All in one!
	        Display.update(); //Swap buffers
	    }
	}

}

