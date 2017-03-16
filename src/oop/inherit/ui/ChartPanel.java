package oop.inherit.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class ChartPanel extends Panel {
	@Override
	public void paint(Graphics g) {
		
		
		super.paint(g);
		
		String peop[]={"10","8","6","4","2"};
		String relat[]={"100","80","60","40","20"};
		
		g.setColor(Color.BLUE);
		g.drawLine(60, 10, 60, 250);
		g.setColor(Color.BLACK);
		g.drawString("인원(명)", 10, 20);
		g.setColor(Color.RED);
		g.drawString("▲", 556, 10);
		g.setColor(Color.BLACK);
		g.drawString("누적상대도수(%)", 580, 20);
		g.setColor(Color.BLUE);
		g.drawString("▲", 56, 10);
		g.setColor(Color.BLUE);
		g.drawLine(60, 250, 560, 250);
		g.setColor(Color.RED);
		g.drawLine(560, 250, 560, 10);
		g.setColor(Color.BLUE);
		g.drawString("▶", 560, 254);
		g.setColor(Color.BLACK);
		
		for(int i=0;i<peop.length;i++){
			g.drawString(peop[i], 34, 50+40*i);
		}
		for(int i=0;i<relat.length;i++){
			g.drawString(relat[i], 574, 50+40*i);
		}
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<5;j++){
				g.setColor(Color.GREEN);
				g.drawString("-", 60+5*i, 50+40*j);
				
			}
			
		}
		
	}
}
