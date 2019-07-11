package com.awsloglevel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyLambdaHandler implements RequestHandler<Void, Void> {

    private static final Logger LOGGER = LogManager.getLogger(MyLambdaHandler .class);

    public Void handleRequest(Void myVoid, Context context) {

        LOGGER.error("Log info enabled: {}", LOGGER.isInfoEnabled());
        LOGGER.info("Info messge");
        LOGGER.error("Log error enabled: {}",  LOGGER.isErrorEnabled());
        LOGGER.error("Error Message");
        LOGGER.error("Log trace enabled: {}",  LOGGER.isTraceEnabled());
        LOGGER.trace("trace message");
        LOGGER.error("Log warning enabled: {}",  LOGGER.isWarnEnabled());
        LOGGER.warn("warn message");
        LOGGER.error("Log debug enabled: {}",  LOGGER.isDebugEnabled());
        LOGGER.debug("debug message");
		return null;

    }

}