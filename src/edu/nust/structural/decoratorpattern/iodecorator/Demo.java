package edu.nust.structural.decoratorpattern.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
	public static void main(String[] args) throws IOException {
		InputStream in = new BufferedInputStream(new FileInputStream("D:/data.txt"));
		InputStream myIn = new MyDecoratorInputStream(in);
		int i ;
		while((i = myIn.read()) >= 0){
			System.out.print((char)i);
		}
		
		
	}
}
