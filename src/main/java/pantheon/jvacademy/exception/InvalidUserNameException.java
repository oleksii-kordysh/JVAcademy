package pantheon.jvacademy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Invalid username declaration")
public class InvalidUserNameException extends RuntimeException {
    public InvalidUserNameException(String message) {
        super(message);
    }
}
