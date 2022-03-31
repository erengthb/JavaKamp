package interfaces;

public class Utils {

	// static kelimesi eklendii i�in customer manager da new leme yapmadan kullanab�l�yoruz
	public static void runLoggers(ILogger[] loggers , String message) {
		for (ILogger logger : loggers) {
			logger.log(message);
		}
		
	}
	
}
