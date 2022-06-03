package iuh.minh.file.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandle {
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> hanldeException(CustomerNotFoundException exc) {
		CustomerErrorResponse error = new CustomerErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
}
