package com.biplav.learnfilereader;

import java.io.IOException;
import java.util.Objects;

public class Calculate{
	
	public String CalculateSomething(String message) throws CalculateException{
		if(message.equalsIgnoreCase("Something")) {
			throw new CalculateException("Message is something");
		}
		return "nothing";
	}
	
}
