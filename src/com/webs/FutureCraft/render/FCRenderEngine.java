package com.webs.FutureCraft.render;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class FCRenderEngine {
public static int getPNGImage(String s){
	Texture texture = null;
	try {
		texture = TextureLoader.getTexture("PNG", new FileInputStream(s));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return texture.getTextureID();
}


}
