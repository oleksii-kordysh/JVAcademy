package pantheon.jvacademy.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pantheon.jvacademy.service.HelloService;

@RestController
@AllArgsConstructor
public class HelloController {
    private HelloService helloService;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public String sayHello() {
        return "Hello Java Academy trainee.";
    }

    @GetMapping("/helloUser")
    @ResponseStatus(code = HttpStatus.OK)
    public String helloUserParam(@RequestParam String userName) {
        return helloService.helloUser(userName);
    }

    @GetMapping("/helloUser/{userName}")
    @ResponseStatus(code = HttpStatus.OK)
    public String helloUserPath(@PathVariable String userName) {
        return helloService.helloUser(userName);
    }
}
