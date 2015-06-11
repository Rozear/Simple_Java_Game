package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy extends GameObject{
	
	public FastEnemy(int x, int y, ID id, Handler myHandler) {
		super(x, y, id, myHandler);
		velX = 2;
		velY = 9;
	}


	public void tick() {
		x += velX;
		y += velY;
		if(y <= 0 || y >= Game.HEIGHT-16) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH-16) velX *= -1;
		Game.gameHandler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 16, 16, 1.0f, 0.02f, Game.gameHandler));

	}


	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(x,y,16,16);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	
}
