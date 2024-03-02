package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdApplication {


    @GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name) {
        //Basant kumar hota
        //sarvindra kumar
       name= name.split(" ")[0];
        return "Hi " + name + " Congratulations you have successfully completed Jenkins CI/CD demo !";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCiCdApplication.class, args);
    }

}
