package pantheon.jvacademy.service;

import org.springframework.stereotype.Service;
import pantheon.jvacademy.exception.InvalidUserNameException;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloUser(String userName) {
        if (userName == null || userName.isEmpty()) {
            throw new InvalidUserNameException("Invalid username declaration");
        }
        return "Hello " + userName + " in Java Academy.";
    }
}
