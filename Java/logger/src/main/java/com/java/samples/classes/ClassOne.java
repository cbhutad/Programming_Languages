package com.java.samples.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassOne {

	private static final Logger logger = LogManager.getLogger(ClassOne.class);

	public void logMessages() {
		logger.info("Info message logged");
		logger.debug("debug message logged");
	}

}
