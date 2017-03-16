package oop.inherit.ui;

import java.awt.Graphics;
import java.awt.Panel;

public class NewlecPanel extends Panel {
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawRect(0, 0, 300, 300);
	}
}
