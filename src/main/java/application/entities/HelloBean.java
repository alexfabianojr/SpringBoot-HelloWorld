package application.entities;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

    public String sayHello() {
        return "Say Hello";
    }
}
