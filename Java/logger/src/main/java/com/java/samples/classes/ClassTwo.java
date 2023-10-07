package com.java.samples.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassTwo {

	private static final Logger logger = LogManager.getLogger(ClassTwo.class);

	public void logMessages() {
		logger.info("Info message logged");
		logger.warn("Warn message logged");
	}
}
