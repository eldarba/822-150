package d;

public class PointXYException extends RuntimeException {

	// ctors from super class
	private static final long serialVersionUID = 1L;

	public PointXYException() {
		super();
	}

	public PointXYException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PointXYException(String message, Throwable cause) {
		super(message, cause);
	}

	public PointXYException(String message) {
		super(message);
	}

	public PointXYException(Throwable cause) {
		super(cause);
	}

}
