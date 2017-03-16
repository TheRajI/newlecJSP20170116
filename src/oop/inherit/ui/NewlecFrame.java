package oop.inherit.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class NewlecFrame extends Frame {
	
	private Panel panel;
	private Panel chartPanel;
	
	public NewlecFrame(){
	/*	panel = new NewlecPanel();
		panel.setBackground(Color.CYAN);
		add(panel, BorderLayout.PAGE_START);
		*/
		chartPanel = new ChartPanel();
		chartPanel.setBackground(Color.WHITE);
		add(chartPanel, BorderLayout.CENTER);
		
	}

	
}
