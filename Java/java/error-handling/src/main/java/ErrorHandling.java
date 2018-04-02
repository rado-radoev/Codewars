import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
    		throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws ClassNotFoundException {
    	throw new ClassNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() throws ArithmeticException {
        throw new ArithmeticException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) throws ArithmeticException {
        throw new ArithmeticException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() throws CustomUncheckedException {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) throws CustomUncheckedException {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
    	try {
    		return Optional.ofNullable(Integer.parseInt(integer));
    	} catch (NumberFormatException nfe) {
    		return Optional.empty();
    	}
    }

}
