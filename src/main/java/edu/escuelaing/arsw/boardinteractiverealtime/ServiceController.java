package edu.escuelaing.arsw.boardinteractiverealtime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController 
{
    @GetMapping("/status")
    public String status() 
    {
        return "{\"status\":\"Greetings from Spring Boot. " +
        java.time.LocalDate.now() + ", " +
        java.time.LocalTime.now() +
        ". " + "The server is Runnig!\"}";
    }
}
