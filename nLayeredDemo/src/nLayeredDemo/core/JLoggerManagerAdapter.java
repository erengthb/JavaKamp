package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService { // adaptasyon için gerekli

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();  // jLoggerdan geliyor
		manager.log(message);
		
	} 

}
