package com.java.samples;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.java.samples.classes.*;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main( String[] args) {

		ClassOne cone = new ClassOne();
		ClassTwo ctwo = new ClassTwo();

		cone.logMessages();	

		logger.trace("trace message logged!!");
		logger.debug("debug message logged!!");
		logger.info("info message logged!!");
		logger.warn("warn message logged!!");
		logger.error("Error Message logged!!!", new NullPointerException("NullError"));
		logger.fatal("fatal message logged!!");

		ctwo.logMessages();

	}
}
