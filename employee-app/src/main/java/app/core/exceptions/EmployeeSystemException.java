package app.core.exceptions;

public class EmployeeSystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeSystemException() {
	}

	public EmployeeSystemException(String message) {
		super(message);
	}

	public EmployeeSystemException(Throwable cause) {
		super(cause);
	}

	public EmployeeSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeSystemException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
