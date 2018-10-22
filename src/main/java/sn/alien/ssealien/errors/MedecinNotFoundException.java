package sn.alien.ssealien.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MedecinNotFoundException extends RuntimeException
{


    public MedecinNotFoundException(String message) {

        super(message);
    }
}
