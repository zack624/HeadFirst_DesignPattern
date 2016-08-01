package edu.nust.structural.decoratorpattern.iodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyDecoratorInputStream extends FilterInputStream {

	protected MyDecoratorInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int i = super.read();
		return i == -1 ? i : Character.toLowerCase((char)i);
		
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for(int i = off ; i < off + result ; i++ ){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
	

}
