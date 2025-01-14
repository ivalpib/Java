package com.biplav.learnfilereader;

import java.io.IOException;

public class CalculateException extends IOException{
	private static final long serialVersionUID = 1L;

	public CalculateException() {
		super();
	}
	public CalculateException(String message) {
		super(message);
	}

}
