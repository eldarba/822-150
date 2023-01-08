package app.core.exceptions;

public class DictionaryException extends Exception {

	private static final long serialVersionUID = 1L;

	public DictionaryException() {
	}

	public DictionaryException(String message) {
		super(message);
	}

	public DictionaryException(Throwable cause) {
		super(cause);
	}

	public DictionaryException(String message, Throwable cause) {
		super(message, cause);
	}

	public DictionaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
