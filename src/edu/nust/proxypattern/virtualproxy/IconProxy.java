package edu.nust.proxypattern.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconProxy implements Icon {
	private ImageIcon imageIcon;
	private int width;
	private int height;
	
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		
	}

	@Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public int getIconHeight() {
		return height;
	}

}
