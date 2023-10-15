package mucolleti.todolist.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import io.micrometer.core.ipc.http.HttpSender.Response;

@ControllerAdvice
public class ExceptionHandlerControll {


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleHtppMessageNotReadableExcpetion(HttpMessageNotReadableException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMostSpecificCause().getMessage());
    }
}
