package a.homework.tar.map.dictionary;

public class DictionaryException extends Exception {
	private static final long serialVersionUID = 1L;

	public DictionaryException() {
		super();
	}

	public DictionaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DictionaryException(String message, Throwable cause) {
		super(message, cause);
	}

	public DictionaryException(String message) {
		super(message);
	}

	public DictionaryException(Throwable cause) {
		super(cause);
	}

}
