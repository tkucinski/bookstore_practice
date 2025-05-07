package pl.tkucinski.bookstore_practice.controller.controller_advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoHandlerFound(NoHandlerFoundException e) {
        Map<String, String> responseBody = Map.of(
                "error", "NOT FOUND",
                "method", e.getHttpMethod(),
                "path", e.getRequestURL()
                );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
    }
}
