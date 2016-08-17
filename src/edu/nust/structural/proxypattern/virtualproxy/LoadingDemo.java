package edu.nust.structural.proxypattern.virtualproxy;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class LoadingDemo {
	
	public static void main(String[] args) {
		new LoadingDemo().run();
	}
	public void run(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon icon = new IconProxy();
//		ImageComponent ic = new ImageComponent(icon);
//		frame.getContentPane().add(ic);
		JButton button = new JButton(icon);
		frame.getContentPane().add(button);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	//专门装icon的容器
	public class ImageComponent extends JComponent {  
	    private Icon icon;  
	  
	    public ImageComponent(Icon icon) {  
	        this.icon = icon;  
	    }  
	  
	    public void setIcon(Icon icon) {  
	        this.icon = icon;  
	    }  
	  
	    public void paintComponent(Graphics g) {  
	        super.paintComponent(g);  
	        int w = icon.getIconWidth();  
	        int h = icon.getIconHeight();  
	        int x = (800 - w)/2;  
	        int y = (600 - h)/2;  
	        icon.paintIcon(this, g, x, y);  
	    }  
	}  
}
