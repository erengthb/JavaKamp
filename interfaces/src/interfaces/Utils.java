package interfaces;

public class Utils {

	// static kelimesi eklendii için customer manager da new leme yapmadan kullanabýlýyoruz
	public static void runLoggers(ILogger[] loggers , String message) {
		for (ILogger logger : loggers) {
			logger.log(message);
		}
		
	}
	
}
