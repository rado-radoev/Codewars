package com.bob.protocol;

public enum PREDEFINDEDANSWERS {
	
	QUESTION("Sure"),
	YELL("Whoa, chill out!"),
	YELL_QUESTION("Calm down, I know what I'm doing!"),
	EMPTY("Fine. Be that way!"),
	OTHER("Whatever."),
	BYE("Bye.");
	
	protected final String quesiton;
	
	private PREDEFINDEDANSWERS(String question) {
		this.quesiton = question;
	}

}
