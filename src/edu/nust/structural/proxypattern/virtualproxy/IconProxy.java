package edu.nust.structural.proxypattern.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconProxy implements Icon {
	private ImageIcon imageIcon;
	private int width;
	private int height;
	//用于判定是否需要创建imageIcon实例
	private boolean flag = false;
	
	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if(imageIcon != null){
			imageIcon.paintIcon(c, g, x, y);
		}else{
			g.drawString("iu is loading", x+100, y+50);
			if(!flag){
				flag = true;
				//新建一个线程实例化真正的调用对象
				Thread t = new Thread(new Runnable() {
					@Override
					public void run() {
						try{
							Thread.sleep(3000);
							URL url = new URL("http://e.hiphotos.baidu.com/baike/c0%3Dbaike116%2C5%2C5%2C116%2C38/sign=6fea50488044ebf8797c6c6db"
								+ "890bc4f/b3119313b07eca8061b250ac962397dda04483c1.jpg");
							imageIcon = new ImageIcon(url,"iu");
							c.repaint();
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				});
				t.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if(imageIcon != null){
			return imageIcon.getIconWidth();
		}else{
			return 500;
		}
	}

	@Override
	public int getIconHeight() {
		if(imageIcon != null){
			return imageIcon.getIconHeight();
		}else{
			return 500;
		}
	}

}
