package com.biplav.learnfilereader;

public class CalculateException extends Exception implements AutoCloseable {
	private static final long serialVersionUID = 1L;

	public CalculateException(String message) {
        super(message);
    }

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
