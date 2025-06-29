package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application started successfully!");
        logger.error("Error: Unable to connect to DataBase.");
        logger.warn("Warning: Disk space running low.");
    }
}

