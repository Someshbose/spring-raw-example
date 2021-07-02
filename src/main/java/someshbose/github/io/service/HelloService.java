package someshbose.github.io.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greetings(String args){
        return "Hola "+ args;
    }
}
