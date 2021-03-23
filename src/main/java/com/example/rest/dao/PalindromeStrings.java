package com.example.rest.dao;

import java.util.ArrayList;
import java.util.List;

public class PalindromeStrings {

	private List<PalindromeString> theStrings;

	public List<PalindromeString> getTheStrings() {
		
		if(theStrings == null) {
			theStrings = new ArrayList<>();
		}
		return theStrings;
	}

	public void setTheStrings(List<PalindromeString> theStrings) {
		this.theStrings = theStrings;
	}
	
}
