package com.java.samples;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main( String[] args) {
		
		logger.trace("trace message logged!!");
		logger.debug("debug message logged!!");
		logger.info("info message logged!!");
		logger.warn("warn message logged!!");
		logger.error("Error Message logged!!!", new NullPointerException("NullError"));
		logger.fatal("fatal message logged!!");

	}
}
