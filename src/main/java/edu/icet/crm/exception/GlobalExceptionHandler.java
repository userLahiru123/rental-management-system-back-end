package edu.icet.crm.exception;

import edu.icet.crm.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    ResponseEntity<ErrorResponse> handleIllegalStateException(IllegalStateException ex,
                                                              WebRequest request) {
        ErrorResponse responseNotFound = ErrorResponse.builder()
                .errorMessage(ex.getMessage()).build();

        return ResponseEntity.ok().body(responseNotFound);
    }
}