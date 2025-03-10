package pro.sky.skyprospringHW2_5Collections.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException() {
    }
}
