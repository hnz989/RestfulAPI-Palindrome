package com.example.rest.dao;

public class PalindromeString {
	
	private int id;
	private String inputStr;
	
	public PalindromeString() {

	}

	public PalindromeString(int id, String inputStr) {
		super();
		this.id = id;
		this.inputStr = inputStr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	@Override
	public String toString() {
		return "PalindromeString [id=" + id + ", inputStr=" + inputStr + "]";
	}
		
}

