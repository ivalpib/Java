package com.biplav.learnfilereader;

public class Calculate implements AutoCloseable{
	public Integer calculateNumber(int num) throws CalculateException{
		if (num < 10){
			throw new CalculateException("Number is less than 3");
		}
		return num;
	}
	public String CalculateSomething(String message) throws CalculateException{
		if (message.equalsIgnoreCase("None")) {
			throw new CalculateException("None is not valid message");
		}
		return message;
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}