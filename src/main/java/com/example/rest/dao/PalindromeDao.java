package com.example.rest.dao;

import org.springframework.stereotype.Repository;

import com.example.rest.service.FindMaxPalindrome;

@Repository
public class PalindromeDao {

	private static PalindromeStrings inputStrings = new PalindromeStrings();
	private static FindMaxPalindrome findLong = new FindMaxPalindrome();
	
	public PalindromeDao() {
		inputStrings.getTheStrings().add(new PalindromeString(1, findLong.findMaxPalindrome("aIbohphobia")));
		inputStrings.getTheStrings().add(new PalindromeString(2, findLong.findMaxPalindrome("iTopiNonAvevanoNipoti")));
		inputStrings.getTheStrings().add(new PalindromeString(3, findLong.findMaxPalindrome("addaddabbaba")));
		
	}

	public static PalindromeStrings getInputStrings() {
		return inputStrings;
	}

	public void addInptStrings(PalindromeString inputString){
		String temp = inputString.getInputStr();
		inputString.setInputStr(findLong.findMaxPalindrome(temp));
		inputStrings.getTheStrings().add(inputString);
	}
	
	
}
