package ru.netology.rest.handlersEx;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.netology.rest.exceptions.UnauthorizedUser;
import ru.netology.reste.exceptions.InvalidCredentials;

public class ExceptionAdvice {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ru.netology.reste.exceptions.InvalidCredentials.class)
    public String handleInvalidCredentials (InvalidCredentials e) {

        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedUser.class)
    public String handleUnauthorizedUser (UnauthorizedUser e) {

        return e.getMessage();
    }
}
